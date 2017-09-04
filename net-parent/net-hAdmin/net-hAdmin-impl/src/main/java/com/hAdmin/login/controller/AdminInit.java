package com.hAdmin.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminInit {

	@RequestMapping("/")
	public String toIndex() {
		return "index";
	}
}
