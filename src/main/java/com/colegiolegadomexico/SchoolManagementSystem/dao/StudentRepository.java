package com.colegiolegadomexico.SchoolManagementSystem.dao;

import com.colegiolegadomexico.SchoolManagementSystem.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students, Integer> {
    // that's it ... no need to write any code LOL!
}
