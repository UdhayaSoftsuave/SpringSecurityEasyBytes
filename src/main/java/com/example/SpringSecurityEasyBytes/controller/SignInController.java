package com.example.SpringSecurityEasyBytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurityEasyBytes.model.AppUser;
import com.example.SpringSecurityEasyBytes.repo.AppUserRepo;

@RestController
public class SignInController {
	
	@Autowired
	public AppUserRepo appUserRepo;
	
	@PostMapping("/registerUser")
	private AppUser signIn(@RequestBody AppUser appUser) {
		AppUser appUser1 = appUserRepo.save(appUser);
		return appUser1;
	}
	@GetMapping("/save")
	private String signIn() {
		return "hello";
	}

}