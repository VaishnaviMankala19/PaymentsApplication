package com.vaishnavi.PaymentsApplication;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
//	@Autowired
//	private TestService testService;
	
//	@GetMapping("/test")
//	public String test() {
//		return testService.getMessage();
//	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
