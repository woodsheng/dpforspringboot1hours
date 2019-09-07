package com.bookcode.dao;

import com.bookcode.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByLastName(String lastname);
}
