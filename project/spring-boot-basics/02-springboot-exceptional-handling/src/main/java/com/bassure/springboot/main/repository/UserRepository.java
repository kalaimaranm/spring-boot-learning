package com.bassure.springboot.main.repository;

import com.bassure.springboot.main.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UserRepository extends JpaRepository<User, Long> {

//    public User findById(Long id);

}
