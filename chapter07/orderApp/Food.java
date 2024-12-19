package chapter07.orderApp;

/*
Food 클래스 (자식 클래스)

식물은 세금 면제
 */

public class Food extends Product{
    Food(String name, int price) {
        super(name, price);
    }

    @Override
    double calculateTax() {
//        return getPrice();
          return 0;
    }
}
