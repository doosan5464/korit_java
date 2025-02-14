package chapter07.orderApp;

/*
Electronics 클래스 (자식 클래스)

전자 제품은 특별 세율 적용 : 15%
 */

public class Electronics extends Product{
    Electronics(String name, int price) {
        super(name, price);                 // 기본생성자로 super로 이렇게 2가지를 보내줘야함
    }
    @Override
    double calculateTax() {
        return getPrice() * 0.15;
    }
}
