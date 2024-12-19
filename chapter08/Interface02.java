package chapter08;

interface Flyable {
    int AVERAGE_SPEED = 100;

    void fly(); // public abstract 생략

    default void land() {   // 착륙하다
        System.out.println("Landing");
    }

    static int getWingCount() {
        return 2;
    }
}

class 봉달새 implements Flyable {
    @Override
    public void fly() {
        System.out.println("봉달새의 평균 속력은 " + AVERAGE_SPEED + "km의 평균 속도보다 느립니다");
    }

    @Override
    public void land() {
        System.out.println("사뿐");
    }
}

class 매 implements Flyable {
    @Override
    public void fly() {
        System.out.println("매의 평균 속력은 " + AVERAGE_SPEED + "km의 평균 속도보다 빠릅니다");
    }

    @Override
    public void land() {
        System.out.println("슈우웅");
    }
}

public class Interface02 {
    public static void main(String[] args) {
        매 bird1 = new 매();
        bird1.fly();    // 매의 평균 속력은 100km의 평균 속도보다 빠릅니다
        bird1.land();   // 슈우웅

        봉달새 bird2 = new 봉달새();
        bird2.fly();    // 봉달새의 평균 속력은 100km의 평균 속도보다 느립니다
        bird2.land();   // 사뿐

        System.out.println(Flyable.getWingCount());  // 2
    }
}
