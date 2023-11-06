package com.example.Library.Management.Systems.Controller;


import com.example.Library.Management.Systems.Entities.Author;
import com.example.Library.Management.Systems.Entities.Book;
import com.example.Library.Management.Systems.Entities.Student;
import com.example.Library.Management.Systems.ResponseObject.BasicDetailsStudentResponse;
import com.example.Library.Management.Systems.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }


    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("id") Integer id){
        return studentService.getStudent(id);
    }

    @GetMapping("/getBasicDetails")
    public BasicDetailsStudentResponse getBasicDetails(@RequestParam("id") Integer id){
        return studentService.getBasicDetails(id);
    }

    }






