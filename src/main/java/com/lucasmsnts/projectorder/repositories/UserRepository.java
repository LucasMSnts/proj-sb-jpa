package com.lucasmsnts.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmsnts.projectorder.entities.User;

// @Repository não é necessario pois está herdando do JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
