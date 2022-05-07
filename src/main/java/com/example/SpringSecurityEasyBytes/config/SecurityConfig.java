package com.example.SpringSecurityEasyBytes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests()
//			.antMatchers("/myAccount").authenticated()
//			.antMatchers("/myBalance").authenticated()
//			.antMatchers("/myLoan").authenticated()
//			.antMatchers("/myCards").authenticated()
//			.antMatchers("/notices").permitAll()
//			.antMatchers("/contact").permitAll()
//		.and()
//		.formLogin() //it allowed and get the request from the browser
//		.and()
//		.httpBasic(); //it is allowed and get the request from the other backend application (RestTemplate) 
//	} 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.anyRequest().denyAll()
		.and()
		.formLogin() //it allowed and get the request from the browser
		.and()
		.httpBasic(); //it is allowed and get the request from the other backend application (RestTemplate) 
	} 
	
	

}
