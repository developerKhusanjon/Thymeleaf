package com.tuychiyev.Thymeleaf.controller;


import com.tuychiyev.Thymeleaf.model.Student;
import com.tuychiyev.Thymeleaf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/getAll")
    public String getStudents(Model model){
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students",students);
        return "table";
    }

    @RequestMapping("/get")
    @ResponseBody
    public Optional<Student> getStudent(Integer id){
        return studentService.getOne(id);
    }

    @PostMapping("/add")
    public String addStudent(Student student){
        studentService.addNew(student);

        return "redirect:/students/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateStudent(Student student){
        studentService.addNew(student);
        return "redirect:/students/getAll";
    }
}
