package org.example.school.repository;

import org.example.school.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository { //extends CrudRepository<Student, Long> {
    Student save(Student student);
}
