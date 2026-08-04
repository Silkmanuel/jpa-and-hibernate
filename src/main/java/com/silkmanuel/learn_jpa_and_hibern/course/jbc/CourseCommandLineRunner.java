package com.silkmanuel.learn_jpa_and_hibern.course.jbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.silkmanuel.learn_jpa_and_hibern.course.Course;
import com.silkmanuel.learn_jpa_and_hibern.course.CourseJdbcRepository;
import com.silkmanuel.learn_jpa_and_hibern.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn GCP", "silkmanuel"));
        repository.insert(new Course(2, "Learn AWS", "silkmanuel"));
        repository.insert(new Course(3, "Learn Azure", "silkmanuel"));
        repository.deleteById(2);
        System.out.println(repository.findById(1));
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
    
}
