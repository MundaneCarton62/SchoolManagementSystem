package com.colegiolegadomexico.SchoolManagementSystem.dao;

import com.colegiolegadomexico.SchoolManagementSystem.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
    // that's it ... no need to write any code LOL!
}
