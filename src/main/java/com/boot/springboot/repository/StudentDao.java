package com.boot.springboot.repository;
import com.boot.springboot.Model.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentDao extends CrudRepository<Student,Integer> {
    public Student findById(int id);

}
