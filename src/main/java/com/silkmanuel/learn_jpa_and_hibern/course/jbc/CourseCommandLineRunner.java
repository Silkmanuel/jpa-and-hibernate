package com.silkmanuel.learn_jpa_and_hibern.course.jbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.silkmanuel.learn_jpa_and_hibern.course.Course;
import com.silkmanuel.learn_jpa_and_hibern.course.CourseJdbcRepository;
import com.silkmanuel.learn_jpa_and_hibern.course.jpa.CourseJpaRepository;
import com.silkmanuel.learn_jpa_and_hibern.course.spring_data_jpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn GCP", "silkmanuel"));
        repository.save(new Course(2, "Learn AWS", "silkmanuel"));
        repository.save(new Course(3, "Learn Azure", "silkmanuel"));
        repository.deleteById(2l);
        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
    
}
