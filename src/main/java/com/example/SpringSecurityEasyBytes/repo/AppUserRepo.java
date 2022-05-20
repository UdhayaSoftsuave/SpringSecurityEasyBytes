package com.example.SpringSecurityEasyBytes.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurityEasyBytes.model.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long>{
	
	Optional<AppUser> findByEmail(String email);

}
