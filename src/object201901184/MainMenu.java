package object201901184;

import java.util.Scanner;
public class MainMenu implements MenuInterface{

    ChangeProduct CP = new ChangeProduct();
    @Override
    public void openMenu(){
        System.out.println();
        System.out.println("무인 라면판매점 제품 목록 운영관리시스템");
        System.out.println("*******************************");
        System.out.println("   목록");
        System.out.println("   1. 무인 라면판매점 운영관리 안내");
        System.out.println("   2. 새로운 제품 추가 및 삭제");
        System.out.println("   3. 프로그램 종료");
        System.out.println("*******************************");
        System.out.println();
        selectMenu();
    }

    // 사용자가 메뉴를 고르는 메소드
    @Override
    public void selectMenu() {

        // 사용자가 목록에서 원하는 것을 고름
        System.out.print("원하는 목록의 이름이나 번호를 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        String menu = sc.nextLine();

        // goMenu를 사용해 원하는 메뉴로 이동
        goMenu(menu);
    }

    // 사용자가 고른 메뉴로 이동함
    @Override
    public void goMenu(String menu) {

        // 사용자가 고른 메뉴의 객체를 만들고 open함
        if(menu.equals("무인 라면판매점 운영관리 안내") || menu.equals("1")) {
            UserGuide UG = new UserGuide();
            UG.openMenu();
        }
        else if(menu.equals("새로운 제품 추가 및 삭제") || menu.equals("2")) {
            CP.openMenu();
        }
        else if(menu.equals("프로그램 종료") || menu.equals("3")) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);

        }
        // 목록에 없는 것을 고르면 selectMenu를 다시 실행하여 다시 입력을 받음
        else {
            System.out.println("목록에 존재하지 않습니다. 다시 입력해주세요.");
        }
        openMenu();
    }
}


