package com.cramsses.consumeapi1.user;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cramsses.consumeapi1.user.pojo.User;

@Service
public class UserService {
	
	//Get user by id
	public User getUser( Integer id) {
		String url = "https://jsonplaceholder.typicode.com/users/"+id;
		RestTemplate restTemplate = new RestTemplate();
		User user = restTemplate.getForObject(url, User.class);
		System.out.println("User: " + user);

		return user;

	}
	
	
	//Get all user
	public List<User> getAllUsers() {
		String url = "https://jsonplaceholder.typicode.com/users/";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<User>> responseEntity = 
				  restTemplate.exchange(
				    url,
				    HttpMethod.GET,
				    null,
				    new ParameterizedTypeReference<List<User>>() {}
				  );
		
		List<User> users = responseEntity.getBody();

		return users;

	}

}
