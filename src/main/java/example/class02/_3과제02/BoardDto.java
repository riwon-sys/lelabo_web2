package example.class02._3과제02;

import lombok.*;

@Setter@Getter@ToString
@AllArgsConstructor@NoArgsConstructor
public class BoardDto {
    private int bno;
    private String title;
    private String content;
}