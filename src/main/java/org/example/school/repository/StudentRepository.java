package org.example.school.repository;

import org.example.school.model.Student;

public interface StudentRepository { //extends CrudRepository<Student, Long> {
    Student save(Student student);
}
