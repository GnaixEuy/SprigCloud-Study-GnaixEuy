package cn.limitless.resttemplateprovider.controller;

import cn.limitless.resttemplateprovider.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/4/1
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@RestController
public class TestController {

	@RequestMapping(value = {"/getForEntity01"})
	public Object getForEntity01(){
		return new User(1L,"张三",23);
	}

	@RequestMapping(value = {"/getForEntity02"})
	public Object getForEntity02(){
		List<User> users = new ArrayList<>();
		users.add(new User(1L,"张三",23));
		users.add(new User(1L,"张三",23));
		users.add(new User(1L,"张三",23));
		return users;
	}

	@RequestMapping(value = {"/getForEntityParams01"})
	public Object getForEntityParams01(User user){
		user.setName(user.getName()+"服务提供者");
		return user;
	}

}
