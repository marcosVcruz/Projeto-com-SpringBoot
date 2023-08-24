package com.marcosVcruz.cursoSpringBoot.repositories;

import com.marcosVcruz.cursoSpringBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
