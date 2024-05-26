package org.example.school.repository.impl;

import org.example.school.model.Student;
import org.example.school.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository // бин репозитория
public class StudentRepositoryImpl implements StudentRepository {
    private final HashMap<Long, Student> students;
    private AtomicInteger idGenerator = new AtomicInteger(0);

    public StudentRepositoryImpl() {
        students = new HashMap<>();
    }

    @Override
    public Student save(Student student) {
        if(student.getId() == null) {
            student.setId(idGenerator.longValue());
            idGenerator.incrementAndGet();
        }
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public Student findById(Long id) {
        return students.get(id);
    }
}
