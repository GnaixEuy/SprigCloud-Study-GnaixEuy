package cn.limitless.eurekaclientprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClientProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientProviderApplication.class, args);
	}

}
