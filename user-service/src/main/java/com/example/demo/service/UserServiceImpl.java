package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.UserEntity;
@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	@Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


	@Override
	public UserEntity createUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return userRepository.save(userEntity);
	}

	@Override
	public List<UserEntity> displayCustomer() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
