package api.documentation.Api.documentation.example.controller;

import api.documentation.Api.documentation.example.model.Student;
import api.documentation.Api.documentation.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping(value = "/students")
    public List<Student> getStudents(){
        return  studentService.getStudents();

    }


    @PostMapping(value = "/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/student/{studentId}")
    public Student getStudent(@PathVariable(name = "studentId") int studentId){

        return studentService.getStudent(studentId);

    }



}
