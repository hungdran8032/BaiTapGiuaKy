package com.hutech.BaiTapGiuaKy.repository;

import com.hutech.BaiTapGiuaKy.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}