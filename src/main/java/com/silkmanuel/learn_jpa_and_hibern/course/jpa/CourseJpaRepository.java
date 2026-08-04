package com.silkmanuel.learn_jpa_and_hibern.course.jpa;

import org.springframework.stereotype.Repository;

import com.silkmanuel.learn_jpa_and_hibern.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insert(Course course){
        entityManager.persist(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }

    @Transactional
    public void deleteById(long id){
        Course course = findById(id);
        if (course != null) {
            entityManager.remove(course);
        }
    }
}
