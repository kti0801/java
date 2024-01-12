package product;

import java.util.Scanner;
public class Productmenu {
    // 주석 6: 참조 타입(배열)
    // 제품의 종류가 들어있는 배열
    public String productType[] = {"Ramyeon", "Drink", "SideDish"};

    // 주석 5: 다형성(인터페이스)
    // TypeOfProduct에서 요청한 제품종류 제품이름을 출력한다.
    public void print(Product product) {
        product.printProduct();
    }

    // TypeOfProduct에서 요청한 제품종류에 제품이름을 추가 또는 삭제한다.
    public void setProduct(Product product) {

        // 제품의 이름을 입력받는다.
        System.out.print("추가할 제품의 이름을 입력해주세요. 추가할 제품이 없다면 '없음'을 입력해주세요: ");
        Scanner scan = new Scanner(System.in);
        String productname = scan.nextLine();

        //만약 제품이름이 없음이면 return하여 메소드 종료
        if(productname.equals("없음")) {
            return;
        }

        // 제품종류객체의 setProduct의 boolean을 return 받는다.
        // true이면 정상적으로 제품이 추가 O
        // false면 이미 같은 제품이 있어 추가 x
        boolean result;
        result = product.setProduct(productname);

        if(result) {
            System.out.println("제품을 추가했습니다.");
        }
        else {
            System.out.println("이미 제품이 존재합니다.");
        }
    }
    public void removeProduct(Product product) {
        System.out.print("삭제할 제품의 이름을 입력해주세요. 삭제할 제품이 없다면 '없음'을 입력해주세요: ");
        Scanner scan = new Scanner(System.in);
        String productname = scan.nextLine();

        //만약 제품이름이 없음이면 return하여 메소드 종료
        if(productname.equals("없음")) {
            return;
        }

        // 제품종류객체의 removeProduct의 boolean을 return 받는다.
        // true이면 정상적으로 제품이 추가 O
        // false면 이미 같은 제품이 있어 추가 x
        boolean result;
        result = product.removeProduct(productname);

        if (result) {
            System.out.println("제품을 삭제했습니다.");
        } else {
            System.out.println("삭제할 제품이 존재하지 않습니다.");
        }
    }
}
