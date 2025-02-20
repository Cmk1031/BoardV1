import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
    게시판 DTO
 */

@Data
@Builder
@AllArgsConstructor
public class Board {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;
}
