package com.boot.springboot.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.id.IncrementGenerator;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private  Department department;


    public Student(int id, String name, String lastName, Department department) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }
}


