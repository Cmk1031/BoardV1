package common;

public class ValidCheck {
    private static final String MENU_NUMBER = "^[1-4]";

    private static final String CHECK_MENU_NUMBER = "^[1-2]";

    private static final String READ_OPTION_NUMBER = "^[1-3]";

    public void isMenuValid(String menu) {
        if(!(menu.matches(MENU_NUMBER))) {
            throw new IllegalArgumentException();
        }
    }

}
