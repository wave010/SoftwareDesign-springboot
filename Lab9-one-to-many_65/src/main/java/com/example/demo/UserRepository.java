package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.*;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
//
public interface UserRepository extends CrudRepository<User, Integer> {

	  List<User> findByName(String name);
}