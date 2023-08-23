package com.marcosVcruz.cursoSpringBoot.repositories;

import com.marcosVcruz.cursoSpringBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
