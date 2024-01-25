package com.example.springboottutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student son = new Student(
                    "Son Tran",
                    "son.tranngoc@gmail.com",
                    LocalDate.of(1981, Month.OCTOBER, 20));
            Student sulam = new Student(
                    "Su Lam",
                    "sulam@gmail.com",
                    LocalDate.of(2013, Month.FEBRUARY, 16));
            repository.saveAll(List.of(son, sulam));
        };
    }
}
