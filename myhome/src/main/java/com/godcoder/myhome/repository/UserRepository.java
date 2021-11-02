package com.godcoder.myhome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.godcoder.myhome.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@EntityGraph(attributePaths = { "boards" })
	List<User> findAll();
	
	User findByUsername(String username);
}
