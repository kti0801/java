package product;

import java.util.*;


public class Drink implements Product{
    // 음료 제품 정보를 파일에 쓰거나 읽기 위한 FileHandler 클래스 활용
    public void writeToFile() {
        FileHandler.writeDrink(new ArrayList<>(set));
    }

    public void readFromFile() {
        List<String> products = FileHandler.readDrink();
        set = new HashSet<>(products);
    }
    // 주석 7: 컬렉션 프레임워크
    // 음료 제품 정보를 담는 HashSet
    Set<String> set = new HashSet<>();

    // 생성자
    public Drink(){
        readFromFile();
    }

    // 목록에 음료수를 추가한다.
    @Override
    public boolean setProduct(String productname) {
        boolean result = set.add(productname);
        writeToFile();
        return result;
    }

    // 목록에 음료수를 제거한다.
    @Override
    public boolean removeProduct(String productname){
        boolean result = set.remove(productname);
        writeToFile();
        return result;
    }

    // 음료수의 목록을 출력한다.
    @Override
    public void printProduct() {
        // iterator를 이용해 출력한다.
        Iterator<String> iter = set.iterator();
        String product;
        while(iter.hasNext()) {
            product = iter.next();
            System.out.println(product);
        }
    }
}
