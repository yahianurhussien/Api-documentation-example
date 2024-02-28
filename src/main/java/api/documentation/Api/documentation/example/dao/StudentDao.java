package api.documentation.Api.documentation.example.dao;

import api.documentation.Api.documentation.example.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDao {
    Map<Integer, Student> dataset = new HashMap<>();

    public StudentDao(){

        Student s1 = new Student(1,"Yahia");
        Student s2 = new Student(2,"Salhadin");
        Student s3 = new Student(3,"Ibrahim");

        dataset.put(s1.getStudentId(),s1);
        dataset.put(s2.getStudentId(),s2);
        dataset.put(s3.getStudentId(),s3);

    }

   public Student getStudent(int studentId){

      return   dataset.get(studentId);
   }


   public List<Student> getStudents(){

       return dataset.values().stream().toList();

    }

    public Student addStudent(Student student){

       dataset.put(student.getStudentId(), student);

        return student;
    }




}
