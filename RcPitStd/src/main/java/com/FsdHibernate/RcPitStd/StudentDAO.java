package com.FsdHibernate.RcPitStd;

import jakarta.transaction.Transactional;

import java.util.List;

public interface StudentDAO {

        void save(Student student);
        // Saves a student to the DB (either insert or update depending on implementation)

        Student findById(Integer id);
        // Retrieves a student by their primary key (ID)

        List<Student> findAll();
        // Returns all student records from the DB

        List<Student> findByLastName(String lastname);
        // Returns students matching a specific last name

        void delete(Integer id);

        void update(Student student);


    @Transactional
    void deleteById(Integer id);
}




