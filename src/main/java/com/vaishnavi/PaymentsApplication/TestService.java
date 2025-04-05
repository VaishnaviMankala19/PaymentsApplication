package com.vaishnavi.PaymentsApplication;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public String getMessage() {
		return "service method injected";
	}
}
