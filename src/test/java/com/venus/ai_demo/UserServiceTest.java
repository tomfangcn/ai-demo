package com.venus.ai_demo;

import com.venus.ai_demo.entity.User;
import com.venus.ai_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testCreateUser() {
        User user = userService.createUser("testuser", "123456", "test@example.com");
        System.out.println("Created user: " + user.getUsername());
    }
}
