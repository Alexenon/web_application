package com.xenon.web_application.controller;

import com.xenon.web_application.model.Student;
import com.xenon.web_application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping
    public Student getStudent(@RequestParam(value = "name", defaultValue = "Bat Alex") String name) {
        return studentService.getStudentByName(name);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student was added";
    }

}
