package com.example.demo.repositorie;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(String name);

    List<User> findByEmail(String email);

    List<User> findByPhone(int phone);
}