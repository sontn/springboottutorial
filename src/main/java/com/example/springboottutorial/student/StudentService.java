package com.example.springboottutorial.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
//        return List.of(
//                new Student(1L,
//                        "Son Tran",
//                        "son.tranngoc@gmail.com",
//                        LocalDate.of(1981, Month.OCTOBER, 20),
//                        45),
//                new Student(2L,
//                        "Su Lam",
//                        "sulam@gmail.com",
//                        LocalDate.of(2013, Month.FEBRUARY, 16),
//                        11)
//        );
        return studentRepository.findAll();
    }
}
