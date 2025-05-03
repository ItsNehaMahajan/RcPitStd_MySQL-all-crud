package com.FsdHibernate.RcPitStd;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentImplDAO implements StudentDAO {

    private final EntityManager entityManager;

    @Autowired
    public StudentImplDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
        System.out.println("Object is Saved ....!");
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastname) {
        TypedQuery<Student> query = entityManager.createQuery(
                "FROM Student WHERE lastName = :theData", Student.class);
        query.setParameter("theData", lastname);
        return query.getResultList();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Transactional
    @Override
    public void deleteById(Integer id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
        }
    }
}
