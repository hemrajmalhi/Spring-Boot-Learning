package com.boot.springboot.services;

import com.boot.springboot.Model.Student;
import com.boot.springboot.repository.StudentDao;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> getAllStudent(){
      List<Student> list=(List<Student>)this.studentDao.findAll();
      return list;

    }
    public Student getNameById(int id){
        Student student=null;
        try{
         student= this.studentDao.findById(id);
        }
        catch (Exception e){
            e.getStackTrace();
        }
            return student;
    }

    public Student addStudent(Student b){
        Student student=this.studentDao.save(b);
        return student;
    }

    public void deleteStudent(int  sid){
        this.studentDao.deleteById(sid);
    }


    public void updateBook(@NotNull Student student, int sid) {
            student.setId(sid);
              studentDao.save(student);

    }
}
