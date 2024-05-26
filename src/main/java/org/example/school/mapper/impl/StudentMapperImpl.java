package org.example.school.mapper.impl;

import org.example.school.dto.StudentDto;
import org.example.school.mapper.StudentMapper;
import org.example.school.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto toDto(Student student) {
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        return dto;
    }

    @Override
    public Student toEntity(StudentDto student) {
        Student entity = new Student();
        entity.setId(student.getId());
        entity.setFirstName(student.getFirstName());
        entity.setLastName(student.getLastName());
        return entity;
    }
}
