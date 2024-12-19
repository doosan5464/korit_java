package chapter07.orderApp;

/*
Main 클래스

: 주문 시스템의 실행 진입점
- 제품 생성, 주문 생성, 주문 결과 출력 등
 */

public class Main {
    public static void main(String[] args) {
        // 제품 생성
        Product laptop = new Electronics("Laptop", 5000); // Electronics에 인자값을 넣고 로직들 처리하고 왼쪽에 laptop이라는 변수에 Product타입으로 자동 변환
                                                                     // ㅇ
        Product apple = new Food("Apple", 6000);

        // 주문 생성
        Order order1 = new Order(laptop, 1);
        Order order2 = new Order(apple, 10);

        System.out.println(order1);
        System.out.println(order2);
        // toString()
        // : '클래스명@해당객체의 주소값' 이 문자열로 출력
        // : 모든 클래스의 최상위 클래스인 Object 클래스에 정의
    }
}
