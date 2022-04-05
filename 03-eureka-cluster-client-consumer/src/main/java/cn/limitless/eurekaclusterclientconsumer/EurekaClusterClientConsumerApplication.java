package cn.limitless.eurekaclusterclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClusterClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterClientConsumerApplication.class, args);
    }

}
