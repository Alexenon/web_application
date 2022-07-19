package com.xenon.web_application.service;

import com.xenon.web_application.model.Student;
import com.xenon.web_application.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    /* TODO: Think about made this method return type to be void */
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

}
