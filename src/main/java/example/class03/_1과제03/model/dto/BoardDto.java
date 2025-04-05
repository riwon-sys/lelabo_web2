package example.class03._1과제03.model.dto;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int bno;
    private String title;
    private String content;
}
