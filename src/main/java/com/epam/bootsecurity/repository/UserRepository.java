package com.epam.bootsecurity.repository;

import com.epam.bootsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);
    void deleteByLogin(String login);
}
