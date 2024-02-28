package api.documentation.Api.documentation.example.controller;

import api.documentation.Api.documentation.example.model.Student;
import api.documentation.Api.documentation.example.service.StudentService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Student controller")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @Operation(
            description = "Get endpoint for student",
            summary = "This is the summery of student get endpoint",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping(value = "/students")
    public List<Student> getStudents(){
        return  studentService.getStudents();

    }


     @Hidden
    @PostMapping(value = "/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/student/{studentId}")
    public Student getStudent(@PathVariable(name = "studentId") int studentId){

        return studentService.getStudent(studentId);

    }



}
