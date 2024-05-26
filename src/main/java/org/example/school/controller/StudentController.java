package org.example.school.controller;

import org.example.school.dto.StudentDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentController {
    @PostMapping("/student")
    StudentDto save(@RequestBody StudentDto student);
}
