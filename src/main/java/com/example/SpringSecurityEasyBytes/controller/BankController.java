package com.example.SpringSecurityEasyBytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/notices")
	public String getNotices() {
		return "Notices";
	}

	@GetMapping("/contact")
	public String getContacts() {
		return "Contact";
	}
	
	@GetMapping("/myAccount")
	public String getAccount() {
		return "account";
	}
	
	@GetMapping("/myBalance")
	public String getBalance() {
		return "Balance";
	}
	
	@GetMapping("/myLoan")
	public String getLoan() {
		return "Loan";
	}

}
