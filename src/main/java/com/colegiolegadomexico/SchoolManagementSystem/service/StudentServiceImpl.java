package com.colegiolegadomexico.SchoolManagementSystem.service;

import com.colegiolegadomexico.SchoolManagementSystem.entity.Students;
import com.colegiolegadomexico.SchoolManagementSystem.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Students> findById(Integer id) {
        return studentRepository.findById(id);
    }

    public Students save(Students students) {
        return studentRepository.save(students);
    }

    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}
