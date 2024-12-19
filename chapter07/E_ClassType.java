package chapter07;

/*
=== 자바에서의 타입 변환 ===

1) 자료형 변환 : 변수 & 자료형에서의 자동 형 변환(명시적), 강제 형 변환(묵시적)
2) 클래스 타입 변환
- 자동 타입 변환(Upcasting), 강제 타입 변환(Downcasting)
: 자료형 변환보다 가능한 범위가 좁음
    >> 서로 상속 관계에 있는 클래스 사이에서만 변환 가능
 */

class Parent {
    void displayInfo() {
        System.out.println("부모 클래스입니다.");
    }
}

class Child extends Parent {
    @Override
    void displayInfo() {
        System.out.println("자식 클래스입니다.");
    }

    void childMethod() {
        System.out.println("자식 클래스만이 가진 메서드입니다.");
    }
}

public class E_ClassType {
    public static void main(String[] args) {
        // == 자동 타입 변환 (Upcasting) ==
        // : 자식 객체를 부모 클래스 타입으로 변환
        // >> 직접 명시 X, 자동으로 타입 변환이 일어남
        // >> 자동 형 변환의 경우 해당 객체는 보존되면서, 사용은 부모 객체처럼 사용
        //      : 두 클래스 간의 공통된 특성이 아닌경우 자식만의 기능은 사용 불가능

        // 1. 자식 객체를 생성하면서 즉시 부모 타입으로 변환하여 저장
        // 부모클래스 객체변수 = new 자식클래스();
        Parent childObject = new Child();   // 자동 타입 변환
        // childObject는 Parent 클래스의 타입이지만, 실제로는 Child 객체를 참조하고 있기 때문에, Child에서 오버라이드한 메서드는 호출할 수 있다.

        childObject.displayInfo();  // 자식 클래스입니다.
        // childObject.childMethod();  // Error : 자식 클래스의 고유 메서드는 호출 불가능
                                       // Cannot resolve method 'childMethod' in 'Parent'

        // 2. 이미 생성된 객체를 부모 타입으로 변환
        Child childObject2 = new Child();
        childObject2.childMethod();

        // 부모클래스 객체변수 = 자식객체변수;
        Parent parentObject = childObject2; // 업캐스팅
        parentObject.displayInfo();
        // parentObject.childMethod(); // Error


        // == 강제 타입 변환(Downcasting) ==
        // : 부모 클래스 타입으로 변환된 객체를 다시 자식 클래스 타입으로 변환하는 것
        // >> 자식 클래스에만 정의된 멤버에 접근 가능

        // 자식타입 객체변수 = (자식타입) 부모객체
        Child child = (Child) parentObject;
        child.childMethod();
        child.displayInfo();

        // cf) 클래스 타입 변환 시 주의점
        // 반드시 상속 관계와 객체의 실제 타입을 확인
        // -> 잘못된 캐스팅은 Exceotion 발생
    }
}
