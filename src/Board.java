import java.text.SimpleDateFormat;
import java.util.Date;

import common.ValidCheck;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

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
