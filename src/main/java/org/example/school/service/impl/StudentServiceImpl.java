package org.example.school.service.impl;

import org.example.school.dto.StudentDto;
import org.example.school.mapper.StudentMapper;
import org.example.school.model.Student;
import org.example.school.repository.StudentRepository;
import org.example.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private final StudentRepository repository;
    @Autowired
    private final StudentMapper mapper;

    public StudentServiceImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Student save(StudentDto student) {
        return repository.save(mapper.toEntity(student));
    }
}
