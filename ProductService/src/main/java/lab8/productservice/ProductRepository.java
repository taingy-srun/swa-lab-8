package lab8.productservice;

import org.springframework.stereotype.Repository;

import java.util.TreeMap;

@Repository
public class ProductRepository {

    private TreeMap<String, Product> map = new TreeMap<>();


    public ProductRepository() {
        map.put("123", new Product("123", "ABC"));
        map.put("124", new Product("124", "ABC"));
        map.put("125", new Product("125", "ABC"));
        map.put("126", new Product("126", "ABC"));
    }

    public Product getProduct(String productNumber) {
        return map.get(productNumber);
    }
}
