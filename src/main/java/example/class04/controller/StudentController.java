package example.class04.controller;

import example.class04.model.dto.StudentDto;
import example.class04.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class04/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // [1].C
    @PostMapping // http://localhost:8080/class04/student
    // { "name" : "유재석" , "kor" : "90" , "math" : "100" }
    public int save( @RequestBody StudentDto studentDto ){
        System.out.println( "StudentController.save" );
        System.out.println( "studentDto = " + studentDto );
        return  studentService.save( studentDto );
    }

    // [2]. R
    @GetMapping // http://localhost:8080/class04/student
    public List<StudentDto>findAll(){
        System.out.println("StudentController.findAll");
        return studentService.findAll();
    }

    // [3]. U
    @PutMapping // http://localhost:8080/class04/student
    // { "sno" : "1" , "name" : "유재석" , "kor" :"90" , "math" : "100" }
    public int update( @RequestBody StudentDto studentDto ){
        System.out.println("StudentController.update");
        System.out.println("studentDto = " + studentDto);
        return studentService.update( studentDto);
    }

    // [4]. D
    @DeleteMapping //http://localhost:8080/class04/student?sno=1
    public int delete( @RequestParam int sno ){
        System.out.println("StudentController.delete");
        System.out.println("sno = " + sno);
        return studentService.delete( sno );
    }


}
