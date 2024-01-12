package object201901184;

// 주석 3: 인터페이스
public interface MenuInterface {
    // 메뉴를 출력하는 메소드
    void openMenu();
    // 사용자가 메뉴를 고르는 메소드
    void selectMenu();
    // 사용자가 고른 메뉴로 이동함
    void goMenu(String menu);
}
