package com.pokopoko.backend.user.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pokopoko.backend.user.dto.UserDto;
import com.pokopoko.backend.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/regTest")
	public UserDto userRegTest(
			@RequestParam("email") String email
			,@RequestParam("nickname") String nickname
			,@RequestParam("password") String password
			) {
		UserDto user = userService.userSaveTest(email, nickname, password);
		return user;
	}
}
