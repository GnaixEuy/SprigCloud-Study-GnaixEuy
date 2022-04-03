package cn.limitless.eurekaclientcustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/4/1
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = {"/test"})
	public String test(){
		final ResponseEntity<String> result = restTemplate.getForEntity("http://02-EUREKA-CLIENT-PROVIDER/test", String.class);
		return "第一个SpringCloud的服务提供者" + result.getBody();
	}
}
