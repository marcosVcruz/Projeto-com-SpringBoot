package com.marcosVcruz.cursoSpringBoot.repositories;

import com.marcosVcruz.cursoSpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
