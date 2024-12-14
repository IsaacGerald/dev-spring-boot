package com.telusko.SpringJDBCEx.repo;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("Added");
    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;
    }
}
