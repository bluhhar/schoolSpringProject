package org.example.school.service;

import org.example.school.dto.StudentDto;
import org.example.school.model.Student;

public interface StudentService {
    Student save(StudentDto student);
}
