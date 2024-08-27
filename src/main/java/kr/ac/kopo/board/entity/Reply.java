package kr.ac.kopo.board.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "board")
public class Reply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String text;
    private String replyer;

    @ManyToOne
    private Member board; // Foreign Key 설정(참조무결성 유지) , board_"primary key name"이 아니다. board 만 해도 자동적으로 참조 관계로 된다.
}
