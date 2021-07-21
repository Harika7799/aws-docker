package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity,String>{

}
