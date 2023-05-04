package lab8.eurekaservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceTwoApplication.class, args);
    }

}
