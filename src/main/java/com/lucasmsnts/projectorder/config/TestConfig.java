package com.lucasmsnts.projectorder.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasmsnts.projectorder.entities.User;
import com.lucasmsnts.projectorder.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Silva", "maria@gmail.com", "987654321", "123456");
		User u2 = new User(null, "Alex Garcia", "alex@gmail.com", "96385274", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
