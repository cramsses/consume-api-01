package com.cramsses.consumeapi1.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.cramsses.consumeapi1.user.pojo.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
public class UserController {

	@RequestMapping("/user_test")
	@ResponseBody
	private String testMessage() {
		String pattern = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		return "UserController running... " + today;

	}

	@RequestMapping("/user")
	@ResponseBody
	private User getUser() {
		String url = "https://jsonplaceholder.typicode.com/users/1";
		RestTemplate restTemplate = new RestTemplate();

		User user = restTemplate.getForObject(url, User.class);
		System.out.println("User: " + user);

		return user;

	}
//
//	private String getUsers() {
//
//	}

}
