package org.example.school.controller.impl;

import org.example.school.controller.StudentController;
import org.example.school.dto.StudentDto;
import org.example.school.mapper.StudentMapper;
import org.example.school.model.Student;
import org.example.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerImpl implements StudentController {
    @Autowired
    private final StudentService service;
    @Autowired
    private final StudentMapper mapper;

    public StudentControllerImpl(StudentService service, StudentMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public StudentDto save(StudentDto student) {
        Student s = service.save(student);
        return mapper.toDto(s);
    }
}
