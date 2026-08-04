package com.silkmanuel.learn_jpa_and_hibern.course.jbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.silkmanuel.learn_jpa_and_hibern.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn GCP", "silkmanuel"));
        repository.insert(new Course(2, "Learn AWS", "silkmanuel"));
        repository.insert(new Course(3, "Learn Azure", "silkmanuel"));
        repository.deleteById(2);
    }
    
}
