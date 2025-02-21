package common;

public enum BoardText {
    HEADER("\n[게시물 목록]"),
    BORDER_LINE("-".repeat(60)),
    //임시
    //BOARD_TITLE("%-4s %-20s %-20s %-20s\n","no", "writer", "date", "title");
    MAIN_MENU("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit"),
    MENU_SELECT("메뉴 선택: ");

    private final String text;


    BoardText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
