package product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FileHandler {
    // 파일 경로 상수 선언
    private static final String RAMYEON = "./data/ramyeon_data.txt";
    private static final String DRINK = "./data/drink_data.txt";
    private static final String SIDEDISH = "./data/sidedish_data.txt";

    // 주석 4: 예외 처리 주제
    // 주석 7: 컬렉션 프레임워크(리스트)
    // 주석 8: 파일 입/출력 사용(문자 기반 스트림)

    // 제품 정보를 파일에 쓰는 메서드
    // fileName: 쓰게될 파일 경로, products: 쓰려는 상품 정보 리스트
    // 성능 향상 보조 스트림 BufferedReader, BufferedWriter를 사용
    private static void writeToFile(String fileName, List<String> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String product : products) {
                writer.write(product);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일에서 상품 정보를 읽어오는 메서드
    // fileName: 읽어올 파일 경로
    private static List<String> readFromFile(String fileName) {
        List<String> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                products.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    // 라면 제품 정보를 파일에 쓰는 메서드
    public static void writeRamyeon(List<String> products) {
        writeToFile(RAMYEON, products);
    }

    // 음료 제품 정보를 파일에 쓰는 메서드
    public static void writeDrink(List<String> products) {
        writeToFile(DRINK, products);
    }

    // 반찬 제품 정보를 파일에 쓰는 메서드
    public static void writeSideDish(List<String> products) {
        writeToFile(SIDEDISH, products);
    }

    // 라면 제품 정보를 파일에서 읽어오는 메서드
    public static List<String> readRamyeon() {
        return readFromFile(RAMYEON);
    }

    // 음료 제품 정보를 파일에서 읽어오는 메서드
    public static List<String> readDrink() {
        return readFromFile(DRINK);
    }

    // 반찬 제품 정보를 파일에서 읽어오는 메서드
    public static List<String> readSideDish() {
        return readFromFile(SIDEDISH);
    }
}