package chapter11;

/*
=== SOLID 원칙 ===

4. 인터페이스 분리 원칙 (Interface Segregation Principle, ISP)
: 하나의 큰 인터페이스보다 여러 개의 작은 인터페이스를 사용하는 것을 권장
- SRP 의 인터페이스 버전. 인터페이스의 단일 책임을 강조
- 클래스는 자신이 사용하지 않는 메서드에 의존하지 않아야 한다


5. 의존 역전 원칙 (Dependency Inversion Principle, DIP)
: 고수준 모듈은 저수준 모듈에 의존해서는 안됨, 둘 다 추상화에 의존해야 함
- 세부 구현이 아닌, 추상화된 인터페이스에 의존하도록 설계
 */


interface Worker {
    void work();
    void eat();
}
class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("로봇은 일을 할 수 있습니다");
    }
    @Override
    public void eat() { // 로봇은 eat이 필요하지 않지만 강제로 구현해야 함
        System.out.println("로봇은 음식을 먹지 않습니다");
    }
}

// === ISP 설계 원칙 ===
interface Workable {
    void work();
}
interface Eatable {
    void eat();
}

class WorkRobot implements Workable {
    @Override
    public void work() {
        System.out.println("로봇은 일을 할 수 있습니다");
    }
}



class Keyboard {

}
class Computer {
    private Keyboard keyboard;

    public Computer() {
        // Computer가 Keyboard라는 구체적인 구현 클래스에 의존
        this.keyboard = new Keyboard();
    }
}

// === DIP 설계 원칙 ===
interface InputDevice {

}
class Mouse implements InputDevice {

}
// DipComputer는 InputDevice라는 추상화에 의존
// - 새로운 입력 장치가 추가되더라도 코드 수정없이 확장 가능
class DisComputer {
    private InputDevice inputDevice;

    public DisComputer(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }
}
// >> 의존 역전 원칙은 각 클래스간의 결합도를 낮추는 것




public class B_OOP {
}
