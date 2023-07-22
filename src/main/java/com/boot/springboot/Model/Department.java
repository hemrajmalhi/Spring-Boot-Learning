package com.boot.springboot.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    private String DepartmentName;
    private  int semester;
    @OneToOne(mappedBy = "department")
    @JsonBackReference
    private Student student;


    public Department(int departmentId, String departmentName, int semester, Student student) {
        this.departmentId = departmentId;
        DepartmentName = departmentName;
        this.semester = semester;
        this.student = student;
    }

    public Department() {
        super();
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", semester=" + semester +
                '}';
    }
}
