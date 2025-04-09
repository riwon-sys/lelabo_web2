// StudentDto 만들기 | rw 25-04-09
package example.class04.model.dto;

import lombok.*;

@Setter @Getter @ToString @Builder
@NoArgsConstructor @AllArgsConstructor
public class StudentDto {
    private int sno;
    private String name;
    private int kor;
    private int math;

}
