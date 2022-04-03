package cn.limitless.eurekaclientcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClientCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientCustomerApplication.class, args);
	}

}
