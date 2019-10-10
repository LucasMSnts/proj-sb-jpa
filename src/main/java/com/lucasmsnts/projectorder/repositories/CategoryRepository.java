package com.lucasmsnts.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmsnts.projectorder.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
