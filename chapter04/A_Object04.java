package chapter04;

// 클래스 생성
// 속성 2개, 메서드 1개
class Book {
    // 클래스 내부의 데이터(속성, 필드)
    String title; // 책 제목
    String publisher; // 출판사
    int pageNumber; // 책 페이지

    // 클래스 내부의 동작(행동, 메서드)
    void displayInfo() {
        System.out.println(title + " - " + publisher);
    }

    int returnPageNumber() {
        return this.pageNumber;
    }

    // === 생성자 함수 ===
    // : new 연산자 사용 시 호출 될 메서드
    // > 생략 시 속성에 기본 값이 할당
    //      기본 타입 : int(0), boolean(false), char(' ')
    //      참조 타입 : null

    // +) 사용자 정의 생성자 함수 생략 시 클래스명과 동일하면서 매개변수가 없는 메서드가 생략
    // 그런데 밑에서 생성자 함수를 만들어버려서 이게 자연스럽게 생략됨. 이렇게 다시 매개변수가 없는 생성자를 지정해주면 밑에서 Book myBook = new Book(); 이게 됨
    Book() {

    }
    Book(String title, String publisher, int pageNumber) {
        this.title = title;
        this.publisher = publisher;
        this.pageNumber = pageNumber;
    }

}

public class A_Object04 {
    public static void main(String[] args) {
        Book myBook = new Book();
        System.out.println(myBook.title); // null
        System.out.println(myBook.publisher); // null
        System.out.println(myBook.pageNumber); // 0

        Book anotherBook = new Book("백설공주","코리아IT아카데미",50);
        Book thirdBook = new Book("신데렐라","에이원플라자",100);

        System.out.println(anotherBook.title); // 백설공주
        System.out.println(anotherBook.pageNumber); // 50

        System.out.println(thirdBook.publisher); // 에이원플라자
        System.out.println(thirdBook.title); // 신데렐라

        // 메서드 호출
        anotherBook.displayInfo(); // 백설공주 - 코리아IT아카데미
        int thirdBookPageNumber = thirdBook.returnPageNumber();
        System.out.println(thirdBookPageNumber); // 100

        System.out.println("=================");

        myBook.displayInfo(); // null - null

        myBook.title = "개구리왕자";
        myBook.publisher = "안녕출판사";
        myBook.pageNumber = 1234;

        myBook.displayInfo(); // 개구리왕자 - 안녕출판사
        // 클래스의 속성에도 값을 넣을 수 있다.


    }
}
