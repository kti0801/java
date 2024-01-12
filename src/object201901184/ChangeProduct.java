package object201901184;

import java.util.Scanner;
import java.util.InputMismatchException;
import product.*;
public class ChangeProduct {
    // 패키지 product의 productmenu 객체를 생성함.
    Productmenu productmenu = new Productmenu();

    // 제품의 종류 객체를 생성
    Ramyeon ramyeon = new Ramyeon();
    Drink drink = new Drink();
    SideDish sidedish = new SideDish();

    public ChangeProduct(){
        ramyeon.readFromFile();
        drink.readFromFile();
        sidedish.readFromFile();
    }


    // 메뉴를 출력하는 메소드
    public void openMenu() {
        System.out.println();
        System.out.println("*******************************");
        System.out.println("   목록");
        System.out.println("   1. 라면");
        System.out.println("   2. 음료수");
        System.out.println("   3. 반찬");
        System.out.println("   4. 뒤로");
        System.out.println("*******************************");
        System.out.println();
        selectMenu();
    }

    // 사용자가 메뉴를 고르는 메소드
    public void selectMenu() {
        System.out.print("원하는 목록의 번호를 입력해주세요: ");
        Scanner scan = new Scanner(System.in);

        // 메뉴의 숫자와 메뉴의 이름 변수
        int menuNum;
        String menuName;


        // 주석 4: 예외처리
        while (true) {
            // 목록의 번호를 입력받는다.
            // int가 아닌 자료형이 입력되면 예외처리한다.
            // 1~4가 아닌 다른 정수가 입력되면 예외처리한다.
            try {
                menuNum = scan.nextInt();
                if (menuNum == 4) {
                    return;
                }
                menuName = productmenu.productType[menuNum - 1];
                break;
            } catch (InputMismatchException e) {
                scan = new Scanner(System.in);
                System.out.println("잘못된 입력입니다. 번호를 입력해주세요.");
                System.out.print("원하는 목록의 번호를 입력해주세요: ");
            } catch (ArrayIndexOutOfBoundsException e) {
                scan = new Scanner(System.in);
                System.out.println("잘못된 입력입니다. 1~4를 입력해주세요.");
                System.out.print("원하는 목록의 번호를 입력해주세요: ");
            }

        }


        System.out.println(menuName);
        goMenu(menuNum);
    }

    // 사용자가 고른 메뉴로 이동함
    public void goMenu(int num) {
        // 메뉴의 음식이름 출력
        if (num == 1) {
            productmenu.print(ramyeon);

            System.out.print("추가 또는 삭제할 작업을 선택하세요 (추가/삭제): ");
            Scanner scan = new Scanner(System.in);
            String action = scan.nextLine();

            if ("추가".equals(action)) {
                productmenu.setProduct(ramyeon);
            } else if ("삭제".equals(action)) {
                productmenu.removeProduct(ramyeon);
            } else {
                System.out.println("잘못된 작업입니다. 다시 시도해주세요.");
            }
        } else if (num == 2) {
            productmenu.print(drink);

            System.out.print("추가 또는 삭제할 작업을 선택하세요 (추가/삭제) 중 입력: ");
            Scanner scan = new Scanner(System.in);
            String action = scan.nextLine();

            if ("추가".equals(action)) {
                productmenu.setProduct(drink);
            } else if ("삭제".equals(action)) {
                productmenu.removeProduct(drink);
            } else {
                System.out.println("잘못된 작업입니다. 다시 시도해주세요.");
            }
        } else {
            productmenu.print(sidedish);

            System.out.print("추가 또는 삭제할 작업을 선택하세요 (추가/삭제): ");
            Scanner scan = new Scanner(System.in);
            String action = scan.nextLine();

            if ("추가".equals(action)) {
                productmenu.setProduct(sidedish);
            } else if ("삭제".equals(action)) {
                productmenu.removeProduct(sidedish);
            } else {
                System.out.println("잘못된 작업입니다. 다시 시도해주세요.");
            }
        }
        openMenu();
    }
}
