package object201901184;

// 주석 2: 클래스 상속(inheritance)
public class UserGuide extends MainMenu{
    @Override
    public void openMenu() {
        System.out.println();
        System.out.println("*******************************");
        System.out.println("   목록");
        System.out.println("   1. 프로그램 안내");
        System.out.println("   2. 도움이 필요한 경우 (연락처)");
        System.out.println("   3. 뒤로");
        System.out.println("*******************************");
        System.out.println();
        selectMenu();
    }

    // 사용자가 메뉴를 고르는 메소드는 Menu의 selectMenu와 같음

    // 사용자가 고른 메뉴로 이동함
    @Override
    public void goMenu(String menu) {
        if(menu.equals("프로그램 안내") || menu.equals("1")) {
            System.out.println();
            System.out.print("<프로그램의 목적>\n\n"
                    + "무인 라면 판매점의 제품 목록을 3개월 주기로 최신으로 유지하세요!!\n\n"
                    + "<추가 및 삭제 제품 목록 기준>\n\n"
                    + "추가 할 제품( 판매점에 없는 매출순위 제품들 목록별 3개씩 )\n"
                    + "삭제 할 제품( 매출이 적은 하위 목록 제품들 목록별 3개씩 )\n\n"
                    + "참고 링크: https://www.cvslove.com/class/salesRanking.asp?siteid=j\n\n"
                    + "위 링크에서 라면, 식품, 음료에서 매출순위를 참고할 것\n");
            openMenu();
        }
        else if(menu.equals("도움이 필요한 경우 연락처") || menu.equals("2")) {
            System.out.print("010-9999-9902 (사장 김토일)\n" + "모르는 부분은 부담갖지말고 물어보세요.\n");
            openMenu();
        }
        else if(menu.equals("뒤로") || menu.equals("3")) {
            System.out.println("메인메뉴로 이동합니다.");
        }
        // 메뉴에 없는 것을 고르면 openMenu실행
        else {
            System.out.println("목록에 존재하지 않습니다. 다시 입력해주세요.");
            openMenu();
        }
    }
}