package com.colegiolegadomexico.SchoolManagementSystem.rest;

import com.colegiolegadomexico.SchoolManagementSystem.entity.Students;
import com.colegiolegadomexico.SchoolManagementSystem.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @GetMapping
    public List<Students> getAllStudents() {
        return studentServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Students> getStudentById(@PathVariable Integer id) {
        return studentServiceImpl.findById(id);
    }

    @PostMapping
    public Students createStudent(@RequestBody Students students) {
        return studentServiceImpl.save(students);
    }

    @PutMapping("/{id}")
    public Students updateStudent(@PathVariable Integer id, @RequestBody Students students) {
        students.setId(id);
        return studentServiceImpl.save(students);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentServiceImpl.deleteById(id);
    }
}
