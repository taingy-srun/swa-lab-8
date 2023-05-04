package lab8.stockservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockServiceTwoApplication.class, args);
    }

}
