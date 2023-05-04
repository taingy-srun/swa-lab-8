package lab8.stockservice;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
@Profile("One")
public class StockService {

    @GetMapping("/{productNumber}")
    public int getStock(@PathVariable String productNumber) {
        return 10;
    }
}
