package com.telusko.student_app.controller;

import com.telusko.student_app.model.Student;
import com.telusko.student_app.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/students")
    public List<Student> getStudents(){
        return studentRepo.findAll();
//       return List.of(
//               new Student(1, "Ranga", 21),
//               new Student(2, "Ravi", 22),
//               new Student(3, "Satish", 23)
//       );
    }
}
