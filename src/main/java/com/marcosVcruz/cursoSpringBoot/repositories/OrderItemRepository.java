package com.marcosVcruz.cursoSpringBoot.repositories;

import com.marcosVcruz.cursoSpringBoot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
