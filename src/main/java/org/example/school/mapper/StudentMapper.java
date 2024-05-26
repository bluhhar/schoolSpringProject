package org.example.school.mapper;

import org.example.school.dto.StudentDto;
import org.example.school.model.Student;

public interface StudentMapper {
    StudentDto toDto(Student student);
    Student toEntity(StudentDto student);
}
