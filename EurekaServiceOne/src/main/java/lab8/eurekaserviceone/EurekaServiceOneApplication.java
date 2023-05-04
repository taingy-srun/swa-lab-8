package lab8.eurekaserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceOneApplication.class, args);
    }

}
