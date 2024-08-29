package com.colegiolegadomexico.SchoolManagementSystem.service;

import com.colegiolegadomexico.SchoolManagementSystem.entity.Staff;

import java.util.List;

public interface StaffService {

    List<Staff> findAll();

    Staff findById(int theId);

    Staff save(Staff theStaff);

    void deleteById(int theId);
}
