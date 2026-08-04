package com.silkmanuel.learn_jpa_and_hibern.course.spring_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silkmanuel.learn_jpa_and_hibern.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    
}
