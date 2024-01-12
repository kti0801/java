/* [주석 1 : 과제 설명]

  객체지향 프로그래밍 평가과제 (배점 25점)
  학과 : 컴퓨터전자시스템공학부
  학번 : 201901184
  이름 : 김토일

  과제 주제 : 무인 라면 판매점의 제품 목록 최신화 프로그램

  판매점에 없는 매출순위 제품들 목록별 3개 추가
  매출이 적은 하위 목록 제품들 목록별 3개 삭제
  https://www.cvslove.com/class/salesRanking.asp?siteid=j
  링크에서 매출이 높은 상품을 참고하여 무인 라면 판매점의 제품을  3개월 주기로 최신화 하는 프로그램
*/

package object201901184;
public class Main {
    public static void main(String[] args){
        // MainMenu 객체생성
        MainMenu menu = new MainMenu();
        while(true){
            //openMenu 실행
            menu.openMenu();
        }
    }
}