package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import java.util.*;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
//
public interface UserRepository extends CrudRepository<User, Integer> {

	  List<User> findByName(String name);
}
/* ต้องมี dependency ต่อไปนี้ ใน pom.xml
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
ดูใน  https://spring.io/guides/gs/accessing-data-mysql/
*/