package com.yaser.dao;

import org.springframework.data.repository.CrudRepository;

import com.yaser.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
