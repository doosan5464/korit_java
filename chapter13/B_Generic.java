package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Basket<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }

    // 와일드 카드<?>
    public static void printBasket(Basket<?> basket) {
        System.out.println("바구니의 과일은 " + basket.getItem() + "입니다.");
    }
}

/*
2) 제네릭 와일드 카드
: 제네릭 타입을 불특정하게 지정할 때 사용
: 주로 상속 관계에 있는 클래스 간의 유연한 타입 처리를 위해 사용
- 모든 타입
= 사용법 =
? 기호를 사용하여 표기
*/

class Message<T> {
    private T message;
    T getMessage() {
        return message;
    }
}

public class B_Generic {
    public static void main(String[] args) {
        Basket<String> stringBasket = new Basket<>();
        stringBasket.setItem("사과");
        System.out.println(stringBasket.getItem());

        Basket<Integer> integerBasket = new Basket<>();
        integerBasket.setItem(123);
        System.out.println(integerBasket.getItem());

        Basket.printBasket(stringBasket); // 바구니의 과일은 사과입니다.
        Basket.printBasket(integerBasket); // 바구니의 과일은 123입니다.

        System.out.println("=========================");
        List<String> arrays = new ArrayList<>();

        Message<?> m1;  // 모든 타입의 Message 객체를 수용
        Message<String> m2;

        m1 = new Message<>();   // Object 타입의 Message 클래스를 사용

        // Object 클래스는 모든 참조 타입의 최상위 클래스
        // : 상속 관계
        String s = (String) m1.getMessage();
        Boolean n = (Boolean) m1.getMessage();
        Character c = (Character) m1.getMessage();

        /*
        == 일반 와일드 카드 ==
        ? : 어떤 타입이든 허용
         */
        List<?> list1 = new ArrayList<>();

        /*
        == 상한 제한 와일드 카드 ==
        <? extends Type>
        : 특정 타입 또는 그 하위 타입만 허용 (사실 모든 와일드카드는 <? extend Object>가 생략 되어 있다는거임)
         */
        List<? extends Number> list2 = new ArrayList<Integer>();

        /*
        == 하한 제한 와일드 카드 ==
        <? super Type>
        : 특정 타입 또는 그 상위 타입만 허용
        cf) Number : 정수, 실수를 모두 포함하는 숫자 값
            Integer : 정수
         */
        List<? super Integer> list3 = new ArrayList<Number>();
        List<? super Integer> list4 = new ArrayList<Object>();
    }
}


