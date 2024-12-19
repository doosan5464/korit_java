package chapter11;

/*
OOP. Object -Oriented-Programming
: 객체 지향 프로그래밍

=== SOLID 원칙 ===
- 면접 질문 단골
: 객체 지향 프로그래밍의 5가지 소프트웨어 개발 원칙
: SRP, OCP, LSP, ISP, DIP
    - 소프트웨어 설계에서 유지보수성과 확장성을 높임
    - 다양한 디자인 패턴이 SOLID 설계 원칙을 따라 만들어짐
    cf) 상속, 추상화, 다형성, 캡슐화 (OOP 4가지 특징)

SOLID 원칙 적용 시 주의사항
: SOLID 원칙 적용 순서 - 없음
: 5가지 원칙이 모두 필수는 아니다 (권장사항)
: 5가지 원칙이 서로 독립적인 개념 X / 서로 개념적으로 연관 O

1. 단일 책임 원칙 (Single Responsibility Principle, SRP)
: 클래스는 단 하나의 책임만 가져야 한다.
- 한 가지의 역할(기능)만 담당
- 하나의 변화 이유만 가져야 한다

== 하나의 클래스가 가지는 하나의 역할과 관련된 변경사항만 클래스에 영향을 미쳐야 한다 ==


2. 개방 폐쇄 원칙 (Open Closed Principle, OCP)
: 소프트웨어 엔티티(클래스, 모듈, 함수 등)는 확장에는 열려 있어야 하고, 수정에는 닫혀 있어야 한다
- 기존 코드를 변경하지 않고 새로운 기능 추가할 수 있어야 함
cf) 확장이 열려있다 - 유연한 코드추가 가능
    변경에 닫혀있다 - 객체에 대한 직접적 수정을 제한
>> 추상화를 통한 관계 구축을 권장


3. 리스코프 치환 원칙 (Liskov Substitution Principle, LSP)
: 상위 클래스의 객체를 하위 클래스의 객체로 치환하더라도 프로그램의 동작이 일관되게 유지되어야 한다
- 자식 클래스는 부모 클래스의 기능을 완전하게 대체할 수 있음
- 업캐스팅된 상태에서 부모의 메서드 사용 시 동작이 가능


4.


5.


 */

class ReportManager {   // 보고서 관련 업무 담당 클래스
    // 보고서 생성
    void generateReport() {
        System.out.println("보고서가 생성됨");
    }
    // 이메일 전송
    void sendEmail() {
        System.out.println("이메일이 전송됨");
    }
}

// === SRP 설계 ===
class ReportGenerator {
    void generateReport() {
        System.out.println("보고서가 생성됨");
    }
}
class EmailSender {
    void sendEmail() {
        System.out.println("이메일이 전송됨");
    }
}



class DisCount {
    double calculateDiscount(boolean isStudent, int amount) {
        if (isStudent) {
            return amount * 0.2;
        } else {
            return amount * 0.1;
        }
    }
}

// === OCP 설계 ===
interface DiscountPolish {
    double calculateDiscount(int amount);
}

class CommonDiscount implements DiscountPolish {
    public double calculateDiscount(int amount) {
        return amount * 0.1;
    }
}
class StudentDiscount implements DiscountPolish {
    public double calculateDiscount(int amount) {
        return amount * 0.2;
    }
}
// >> 추상 클래스, 인터페이스와 상속, 구현을 통한 클래스 관계 구축



class Bird {
    void fly() {
        System.out.println("새는 날 수 있습니다");
    }
}
class Penguin extends Bird {
    @Override
    void fly() {    // 펭귄은 '새'를 상속받지만 부모 클래스의 fly메서드가 가지는 동작이 의도대로 구현 X
        System.out.println("펭귄은 날 수 없습니다");
    }
}

// === LSP 설계 ===
abstract class AbstractBird {
    abstract void move();
}

class FlyingBird extends AbstractBird {
    @Override
    public void move() {
        System.out.println("날 수 있는 새들입니다");
    }
}
class Pororo extends AbstractBird{
    @Override
    public void move() {
        System.out.println("펭귄은 수영할 수 있습니다");
    }
}





public class A_OOP {
    public static void main(String[] args) {

    }
}
