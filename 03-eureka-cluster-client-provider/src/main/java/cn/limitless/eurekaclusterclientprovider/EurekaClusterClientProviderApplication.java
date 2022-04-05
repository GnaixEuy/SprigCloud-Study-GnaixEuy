package cn.limitless.eurekaclusterclientprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClusterClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterClientProviderApplication.class, args);
    }

}
