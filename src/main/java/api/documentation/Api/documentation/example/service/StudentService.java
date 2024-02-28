package api.documentation.Api.documentation.example.service;

import api.documentation.Api.documentation.example.dao.StudentDao;
import api.documentation.Api.documentation.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;



    public Student getStudent(int studentId){

        return studentDao.getStudent(studentId);

    }

    public List<Student> getStudents(){
        List<Student> lists = studentDao.getStudents();
        return  lists;
    }

    public Student addStudent(Student student){
       return studentDao.addStudent(student);
    }

}
