package com.hutech.BaiTapGiuaKy.repository;

import com.hutech.BaiTapGiuaKy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}