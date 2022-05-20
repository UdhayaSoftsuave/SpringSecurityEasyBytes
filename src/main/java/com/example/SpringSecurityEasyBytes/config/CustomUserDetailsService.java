package com.example.SpringSecurityEasyBytes.config;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityEasyBytes.model.AppUser;
import com.example.SpringSecurityEasyBytes.repo.AppUserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private AppUserRepo appUserRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AppUser> user = appUserRepo.findByEmail(username);
		System.out.println(user.isEmpty());
		System.out.println(user.isPresent());
		System.out.println(user.orElseThrow());
		return new CustomUserDetails(user.get());
	}
}
