package chapter06;

/*
=== 상속(Inheriteance) ===
: 한 클래스의 속성과 메서드를 다른 클래스가 물려받는 것
- 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
    -> 코드의 재사용성과 중복을 제거하여 프로그램의 생산성이 향상

- 상속 구현 방법
: extends 키워드를 사용하여 구현 (확장하다)

    cf) 명칭
    상속해주는 클래스(Parent) - 조상, 부모, 상위, 슈퍼, 기반 클래스
    상속 받는 클래스(Child) - 자손, 자식, 하위, 서브, 파생 클래스


 */

class Parent {} // 기존 클래스 (부모 클래스)
class Child extends Parent {}   // 새로운 클래스 (자식 클래스)

// == 동물 클래스 ==
class Animal {
    String name;
}

// dog 자식 클래스 - animal 부모 클래스
class Dog extends Animal {
    // 부모 클래스의 속성과 메서드를 모두 상속 받음
//    String name; 이게 지금 생략되어 있음

    void bark() {
        System.out.println("강아지가 짖습니다.");
    }
}

// == 상속 예시 ==
class Tv {
    boolean power; // 전원 상태 on off - true false
    int channel; // 채널 번호

    void setPower() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
class SmartTv extends Tv {
    boolean ott;    // ott 플랫폼 전원 상태 on off

    void displayOtt(String platform) {
        if(ott) {
            System.out.println(platform);
        } else {
            System.out.println("OTT 연결이 되지 않았습니다");
        }
    }
}

public class Inheritance01 {
    public static void main(String[] args) {
        Dog choco = new Dog();
        choco.name = "초코";
        System.out.println(choco.name); // 초코

        SmartTv smartTv = new SmartTv();
        smartTv.channel = 10;
        smartTv.channelUp();
        smartTv.channelUp();
        smartTv.channelUp();
        System.out.println(smartTv.channel); // 13

        smartTv.displayOtt("NetFlix"); // OTT 연결이 되지 않았습니다
        smartTv.ott = true;
        smartTv.displayOtt("NetFlix"); // NetFlix
    }
}
