package com.social.login.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.login.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	public User findByEmail(String email);
}
