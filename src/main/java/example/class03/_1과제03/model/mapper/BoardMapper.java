package example.class03._1과제03.model.mapper;

import example.class03._1과제03.model.dto.BoardDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    // + SQL 매핑 하는 방법 : 1. .XML 파일에 작성된 sql 매핑 지원  2.@SQL어노테이션 매핑 지원

    // @Insert(" insert into class03board( title , content ) values( #{ title } , #{ content } ) ") // [4] 어노테이션 SQL 매핑
    int save(BoardDto boardDto );// [4] .xml 파일의 SQL 매핑 ( 복잡한 쿼리 관리 편리성 )

    // @Select(" select * from class03board ")
    public abstract List< BoardDto > findAll();

    // @Select(" select * from class03board where bno = #{ bno }")
    BoardDto find( int bno );

    // @Update(" update class03board set title = #{ title } , content = #{ content } where bno = #{ bno } ")
    int update(  BoardDto boardDto );

    // @Delete(" delete from class03board where bno = #{ bno }" )
    int delete(  int bno );
}
