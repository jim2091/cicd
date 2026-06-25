package com.kh.deploy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public String home() {
		return "젠킨스 대시보드 되나?";
	}
}
