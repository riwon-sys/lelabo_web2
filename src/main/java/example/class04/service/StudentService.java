// StudentService 만들기 | rw 25-04-09
package example.class04.service;

import example.class04.model.dto.StudentDto;
import example.class04.model.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 스프링 컨테이너에 빈 (인스턴스) 등록.
public class StudentService {
    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }
    // @Autowired private StudentMapper studentMapper;

     // [1]. C
     public int save(StudentDto studentDto){
       return studentMapper.save(studentDto);
     }


     //  [2]. R
     public List<StudentDto> findAll(){
         return studentMapper.findAll();
      }



     // [3]. R
     public int update( StudentDto studentDto ){
         return studentMapper.update( studentDto );
      }



     // [4]. D
     public int delete( int sno ){
         return studentMapper.delete( sno );
     }

}
