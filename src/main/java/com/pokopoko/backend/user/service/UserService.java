package com.pokopoko.backend.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokopoko.backend.user.domain.UserInfo;
import com.pokopoko.backend.user.dto.UserDto;
import com.pokopoko.backend.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserDto userSaveTest(String email, String nickname, String password) {
		
		UserInfo userinfo = userRepository.save(UserInfo.builder()
				.email(email)
				.nickname(nickname)
				.password(password)
				.build()
				);
		
		return userinfo.toUserDto();
	}
}
