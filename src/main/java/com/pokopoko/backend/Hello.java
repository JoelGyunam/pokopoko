package com.pokopoko.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags= {"swagger 테스트"})
@RestController
@RequestMapping("/hello")
public class Hello {
	
	@ApiOperation(value="hello")
	@GetMapping
	public String hello() {
		return "hello";
	}
	
}
