package com.FsdHibernate.RcPitStd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rcpitstd")
public class Student {

    @Id
    @Column(name="regno")
    int regNo;

    @Column(name="firstname")
    String firstName;

    @Column(name="lastname")
    String lastName;

    @Column(name="dept")
    String dept;

    @Column(name="email")
    String email;

 Student(){

 }

    public Student(int regNo, String firstName, String lastName, String dept, String email) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.email = email;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo=" + regNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dept='" + dept + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
