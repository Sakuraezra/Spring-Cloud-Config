package com.example.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author ezra
 * @ date 2019/3/15 14:39
 */

@RestController
public class HelloController {


	@Value("${neo.hello}")
	private String hello;

	@RequestMapping("/hello")
	public String from()
	{
		return this.hello;
	}

}
