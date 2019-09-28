package com.lucasmsnts.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmsnts.projectorder.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
