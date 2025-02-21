package common;

public enum BoardText {
    HEADER("\n[게시물 목록]"),
    BORDER_LINE("-".repeat(60)),
    //임시
    //BOARD_TITLE("%-4s %-20s %-20s %-20s\n","no", "writer", "date", "title");
    MAIN_MENU("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit"),
    MENU_SELECT("메뉴 선택: "),
    CREATE("\n[새 게시물 입력]"),
    MENU1("제목: "),
    MENU2("내용: "),
    MENU3("작성자: "),
    READ("\n[게시물 읽기]"),

    READ_NUMBER("bno: "),

    READ_BNO("번호: "),
    READ_TITLE("제목: "),
    READ_BOARD("내용: "),
    READ_WRITER("작성자: "),
    READ_DATE("날짜: "),

    READ_LINE("#".repeat(30)),

    private final String text;


    BoardText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
