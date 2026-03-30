package com.venus.ai_demo.repo;

import com.venus.ai_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // 派生查询：根据 username 查找
    Optional<User> findByUsername(String username);

    // 派生查询：根据 email 查找，并返回 List
    List<User> findByEmail(String email);

    // 自定义 JPQL 查询
    @Query("SELECT u FROM User u WHERE u.username LIKE %:keyword%")
    List<User> searchByUsername(@Param("keyword") String keyword);
}
