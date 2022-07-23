package com.xenon.web_application.service;

import com.xenon.web_application.model.Student;
import com.xenon.web_application.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentByName(String name) {
        return repository.findStudentByName(name);
    }

}
