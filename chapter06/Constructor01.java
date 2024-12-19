package chapter06;

/*
클래스 구조
: 필드, 메서드, 생성자

=== 생성자 ===
: 객체(인스턴스)가 생성될 때 호출되는 '인스턴스 초기화 메서드'

생성자 조건
- 생성자 이름은 클래스 이름과 동일
- 리턴값이 없는 메서드 형식 (void 생략)

'컴파일러가 제공하는 기본 생성자'
: 클래스에 생성자가 없으면 컴파일러가 자동으로 생성해줌
: 매개변수가 없고, 아무 작업도 하지 않는 생성자

cf) 인스턴스 생성
    : 생성자가 인스턴스 생성 x
    : "new 연산자" 키워드가 인스턴스를 생성 o
 */

class Example1 {
    int value;
    // 컴파일러가 제공하는 기본 생성자(매개변수 x, 아무런 구현 x)가 생략
}

class Example2 {
    int value;
    // 사용자 정의 생성자
    // : 컴파일러가 자동으로 기본 생성자를 제거
    Example2(int x) {
        value = x;
    }
    // 빈 생성자를 직접 명시해야만 사용 가능
    // >> 사용자 정의 생성자가 1개라도 있는 경우
    // Example2() {}
}

class Car {
    String color;
    String gearType; // 자동(auto), 수동(manual)
    int door;

    Car() {} // 기본 생성자 - 차를 생성한 후 필드값 할당

    // 사용자 정의 생성자
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(String color) {
        // cf)정의 생성자에서 다른 생성자 호출 시 : this() 사용
        //      : 생성자 이름으로 클래스 이름 대신 this를 사용
        //      : 정의 생성자에서 다른 생성자 호출 시 반드시 첫 줄에서만 호출 가능
        //
        //      -> 쓰는 이유 : 호출된 생성자가 변수값을 초기화하는 경우
        //                  : 해당 생성자가 수행하는 작업을 유지하기 위함(무의미함 방지)
        // 생성자의 오버로딩

        // door = 5;
        this(color, "auto",4); // 위의 생성자를 이 인수들로 매개변수에 넣어서 실행함(color만 입력, 나머지 둘은 고정)
        // Call to 'this()' must be first statement in constructor body

        // 객체 생성시 속성만 작성하는 경우 - 색상 + auto + 문 5개
        door = 5;

        // this(color, "auto", 4); - Error
    }

    void displayInfo() {
        System.out.println(color + " " + gearType + " " + door);
    }
}

/*
this 키워드
1. this
: 인스턴스 자신을 참조
: 모든 인스턴스 메서드와 생성자에서 사용 가능

2. this()
: 같은 클래스 내의 다른 생성자를 호출할 때 사용
: 중복 코드 제거와 유지보수성 향상에 기여
 */

public class Constructor01 {
    public static void main(String[] args) {
       Example1 example1 = new Example1();
       example1.value = 10;
       System.out.println(example1.value); // 10

       // 인스턴스 생성 시 반드시 인자값이 필요 (초기화 값)
       Example2 example2 = new Example2(10);
       System.out.println(example2.value); // 10

       System.out.println("=== Car 클래스 사용 ===");
       Car car1 = new Car(); // 기본 생성자
       car1.color = "red";
       car1.door = 2;
       car1.gearType = "manual";
       car1.displayInfo();  // red manual 2

       Car car2 = new Car("White","auto",4);    // 사용자 정의 생성자
       car2.displayInfo(); // White auto 4

       Car car3 = new Car("blue");
       car3.displayInfo(); // blue auto 5
    }
}
