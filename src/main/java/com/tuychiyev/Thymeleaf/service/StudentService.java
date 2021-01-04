package com.tuychiyev.Thymeleaf.service;

import com.tuychiyev.Thymeleaf.model.Student;
import com.tuychiyev.Thymeleaf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(@Autowired StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getOne(Integer id){
        return studentRepository.findById(id);
    }

    public void addNew(Student student){
        studentRepository.save(student);
    }
}
