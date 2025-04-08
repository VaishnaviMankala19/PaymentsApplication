package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserDetailsController {
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@GetMapping("/editprofile")
	public String editprofile() {
		return "editprofile";
	}
}
