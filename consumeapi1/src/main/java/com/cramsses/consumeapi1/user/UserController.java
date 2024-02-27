package com.cramsses.consumeapi1.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cramsses.consumeapi1.user.pojo.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user_test")
	@ResponseBody
	private String testMessage() {
		String pattern = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		return "UserController running... " + today;

	}

	@RequestMapping("/user/{id}")
	@ResponseBody
	private User getUser(@PathVariable Integer id) {
		
		User user = userService.getUser(id);
		System.out.println("User: " + user);

		return user;

	}

	@RequestMapping("/users")
	@ResponseBody
	private List<User> getUsers() {
		
		List<User> users = userService.getAllUsers();
		//System.out.println("User: " + user);

		return users;

	}

}
