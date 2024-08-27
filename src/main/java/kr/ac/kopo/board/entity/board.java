package kr.ac.kopo.board.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")
public class board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 자동증가(auto-increment)
    private Long bno;
    private String title;
    private String content;

    @ManyToOne
    private Member writer; // Foreign Key 설정(참조무결성 유지) , writer_"primary key name"이 아니다. writer 만 해도 자동적으로 참조 관계로 된다.
}
