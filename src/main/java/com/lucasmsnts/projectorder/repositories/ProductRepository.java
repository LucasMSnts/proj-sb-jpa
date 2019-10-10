package com.lucasmsnts.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmsnts.projectorder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
