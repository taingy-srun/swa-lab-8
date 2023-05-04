package lab8.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private StockFeignClient stockFeignClient;
    public Product getProduct(String productNumber) {
        Product product = repository.getProduct(productNumber);
        if (product == null) {
            return null;
        }
        product.setNumberOnStock(stockFeignClient.getStock(productNumber));
        return product;
    }

    @FeignClient("StockService")
    @RibbonClient("StockService")
    interface StockFeignClient {

        @RequestMapping("/stock/{productNumber}")
        int getStock(@PathVariable String productNumber);
    }
}
