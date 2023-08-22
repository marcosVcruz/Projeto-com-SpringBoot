package com.marcosVcruz.cursoSpringBoot.repositories;

import com.marcosVcruz.cursoSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
