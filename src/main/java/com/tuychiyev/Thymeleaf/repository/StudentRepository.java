package com.tuychiyev.Thymeleaf.repository;

import com.tuychiyev.Thymeleaf.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
