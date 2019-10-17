package com.lucasmsnts.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmsnts.projectorder.entities.OrderItem;

// @Repository is not necessary because it's inherited from the JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
