package chapter07.animalApp;

class TTest {
    void testt() {
        System.out.println("Tessss");
    }
}
class Son extends TTest {
    @Override
    void testt() {
        System.out.println("Sonnn");
    }
}
public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.testt();

        TTest tTest = new TTest();
        tTest.testt();
    }
}
