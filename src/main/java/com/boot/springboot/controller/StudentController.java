package com.boot.springboot.controller;
import java.util.List;
import java.util.Optional;
import com.boot.springboot.Model.Student;
import com.boot.springboot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
        @GetMapping("/student")
        public ResponseEntity<List<Student>> getStudent() {
           List<Student> students= this.studentService.getAllStudent();
           if (students.size()<=0){
               return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
           }

            return ResponseEntity.of(Optional.of(students));

        }

  @GetMapping("/student/{id}" )
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id ) {
            Student student=studentService.getNameById(id);
            if (student==null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
       return ResponseEntity.of(Optional.of(student));

    }

    @PostMapping("/student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
            studentService.addStudent(student);
            return new ResponseEntity<>("Data is Added Successfully",HttpStatus.OK);
    }
@DeleteMapping("/student/{sid}")
    public void deleteStudent(@PathVariable("sid") int sid){
    System.out.println(sid);
           this.studentService.deleteStudent(sid);
    }

@PutMapping("/student/{sid}")
    public Student updateStudent(@RequestBody Student student,@PathVariable("sid") int sid){
            this.studentService.updateBook(student,sid);
            return student;
    }



}

