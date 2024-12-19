package chapter04;

class Card {
    // 인스턴스 변수
    // : 각 카드마다 고유의 속성(개별속성)
    int number;
    String kind;

    // 클래스 변수
    // : 모든 카드가 공유할 속성
    static int width = 100;
    static int height = 250;
}

public class A_ObjectPractice {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

//        System.out.println(Card.kind); 에러

        // 클래스 Card의 객체(인스턴스) 생성
        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = 7;

        System.out.println(c1.kind + c1.number); // Spade7

//        System.out.println(c1.width); 100 권장 안함
    }
}
