// StudentMapper 만들기 | rw 25-04-09
package example.class04.model.mapper;

import example.class04.model.dto.StudentDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    // 방법1 : .XML
    // 방법2 : @SQL

    // [1]. C
    @Insert(" insert into student (name , kor , math )values  (#{ name } , #{ kor } , #{ math })")
    int save(StudentDto studentDto);

    // [2]. R
    @Select(" select * from student")
    public List<StudentDto>findAll();

    // [3]. U
    @Update("UPDATE student SET name = #{name}, kor = #{kor}, math = #{math} WHERE sno = #{sno}")
    int update(StudentDto studentDto);

    // [4]. D
    @Delete("DELETE FROM student WHERE sno = #{sno}")
    int delete(int sno);

}
