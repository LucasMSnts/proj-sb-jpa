package com.lucasmsnts.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmsnts.projectorder.entities.User;

// @Repository is not necessary because it's inherited from the JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
