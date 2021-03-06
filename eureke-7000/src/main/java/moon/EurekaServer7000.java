package moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wendongshan
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7000.class, args);
    }

}
