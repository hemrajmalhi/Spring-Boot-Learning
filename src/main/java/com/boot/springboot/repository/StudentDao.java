package com.boot.springboot.repository;

import com.boot.springboot.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer>,CrudRepository<Student,Integer> {
    public List<Student> findAllByName(String name);
    public List<Student> findByNameAndLastName(String name,String lastName);
    public List<Student> findByLastName(String lastName);

}
