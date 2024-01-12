package product;

// 주석 3: 인터페이스
public interface Product {
    // 제품을 추가함
    public boolean setProduct(String productname);
    // 제품을 삭제함
    public boolean removeProduct(String productname);
    // 제품의 이름을 출력
    public void printProduct();
}
