package com.example.SpringSecurityEasyBytes.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests().anyRequest().authenticated()
		.and()
		.formLogin() //it allowed and get the request from the browser
		.and()
		.httpBasic(); //it is allowed and get the request from the other backend application (RestTemplate) 
	} 
	
	

}
