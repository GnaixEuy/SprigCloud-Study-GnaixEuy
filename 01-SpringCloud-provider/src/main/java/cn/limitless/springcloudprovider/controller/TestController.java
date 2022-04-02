package cn.limitless.springcloudprovider.controller;

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
	@RequestMapping(value = {"/test"})
	public String test(){
		final RestTemplate restTemplate = new RestTemplate();
		final ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:8081/test", String.class);
		System.out.println(result.getStatusCode());
		System.out.println(result.getHeaders());
		final String body = result.getBody();
		return "第一个的SpringCloud的服务消费者" + body;
	}
}
