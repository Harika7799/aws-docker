package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserEntity;

public interface UserService {
	public UserEntity createUser(UserEntity userEntity);
    public List<UserEntity> displayCustomer();

}
