package cn.limitless.resttemplateconsumer.controller;

import cn.limitless.resttemplateconsumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <img src="https://c-ssl.duitang.com/uploads/blog/202112/05/20211205134707_afc15.thumb.1000_0.gif"/>
 *
 * @author GnaixEuy
 * @date 2022/4/1
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = {"/getForEntity01"})
	public String getForEntity01(){
		ResponseEntity<User> forEntity = this.restTemplate.getForEntity("http://localhost:8082/getForEntity01", User.class);
		return "服务提供者"+forEntity.getBody();
	}

	@RequestMapping(value = {"/getForEntity02"})
	public String getForEntity02(){
		ResponseEntity<List> forEntity = this.restTemplate.getForEntity("http://localhost:8082/getForEntity02", List.class);
		return "服务提供者"+forEntity.getBody();
	}

	@RequestMapping(value = {"/getForEntityParams01"})
	public String getForEntityParams01(){
		String url = "http://localhost:8082/getForEntityParams01?id={0}&name={1}&age={2}";
		Object[] params = {2L,"李四",34};
		ResponseEntity<User> forEntity = this.restTemplate.getForEntity(url, User.class,params);
		return "服务提供者"+forEntity.getBody();
	}
}
