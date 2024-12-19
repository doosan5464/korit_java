package chapter14.review;

/*
=== 익명 (내부, 중첩) 클래스 ===
: 클래스를 정의하면서 동시에 인스턴스화가 이뤄지는 방법
>> 이름이 없기 때문에 재사용 X, 1회성 사용 개체 정의에 유용
 */

// 1. 인터페이스 구현 예시
interface Animal {
    void sound();   // 추상 메서드 - 구현이 없는 메서드 { }

    // cf) 람다 표현식으로 변환 가능한 인터페이스는 '함수형 인터페이스'로
    //     단 하나의 추상 메서드만을 가져야 한다
}

// 인터페이스를 구현한 클래스 - 재사용 O
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}


// 2. 추상 클래스 예시
abstract class Vehicle {
    abstract void run();    // 추상 메서드
}

// 2-1. 추상 클래스 예시 (반환타입 String)
abstract class Person {
    abstract String getName();
}

public class A_Anonymous {
    public static void main(String[] args) {
        // 클래스 이름으로 지정한게 아니라 함수처럼 쓰이기 때문에 ; 즉 재사용 X
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("멍멍");
            }
        };
        dog.sound();
        dog.sound();

        Animal dog2 = new Animal() {
            @Override
            public void sound() {
                System.out.println("멍멍??");
            }
        };
        dog2.sound();
        dog2.sound();

        Vehicle car = new Vehicle() {
            @Override
            void run() {
                System.out.println("자동차가 달립니다");
            }
        };
        car.run();
        car.run();

        // 추상 메서드이긴 한데 반환타입이 String
        Person person = new Person() {
            @Override
            String getName() {
                return "사람";
            }
        };
        System.out.println(person.getName());




    }
}
