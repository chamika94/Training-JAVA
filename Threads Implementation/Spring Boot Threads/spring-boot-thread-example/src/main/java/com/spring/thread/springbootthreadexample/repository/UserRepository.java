package com.spring.thread.springbootthreadexample.repository;

import com.spring.thread.springbootthreadexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
