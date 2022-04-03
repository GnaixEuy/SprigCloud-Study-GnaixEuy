package cn.limitless.eurekaclusterserver9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterServer9100Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterServer9100Application.class, args);
    }

}
