package chapter07;

/*
=== 도서 관리 시스템 ===
: 책의 정보를 저장, 책의 상태(대여 가능 여부)를 확인, 책의 정보를 출력

1) Book 클래스
    속성 : title(String), author(String), isAvailable(boolean)
    메서드 : 생성자(title, author), borrowBook(), returnBook(), displayInfo()

2) EBook 클래스 - Book 클래스를 상속 / 열고 난 이후 취소, 환불 불가능
    추가 속성 : fileSize(double)
    메서드 : 생성자(title, author, fileSize)
        오버라이딩(displayInfo + fileSize)
    +) Book 클래스의 returnBook() 메서드에 final을 적용 : 오버라이딩 X
 */

class Book {
    private String title;
    private String author;
    private boolean isAvailable = true; // 책의 초기 상태 : 대여 가능

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 책 대여 메서드
    void borrowBook() {
        if(isAvailable) {
            System.out.println("책 대여가 성공적으로 완료되었습니다.");
            isAvailable = false;
        } else {
            System.out.println("현재 대여 중입니다. (대여 X)");
        }
    }

    // 책 반납 메서드
    // : final 키워드 사용
    public final void returnBook() {
        if(!isAvailable) {
            // 책이 대여 중인 상태
            isAvailable = true;
            System.out.println("책 반납이 성공적으로 완료되었습니다.");
        } else {
            System.out.println("이미 반납된 상태입니다. (반납 X)");
        }
    }

    // 책 정보 출력 메서드
    void displayInfo() {
        System.out.println("제목 : " + title + ", 자지 : " + author + ", 대여 가능 여부 : " + (isAvailable ? "대여 가능" : "대여 불가"));
    }
}

class Ebook extends Book {

//    Ebook(String title, String author) {
//        super();
//    }

    private double fileSize;

    Ebook(String title, String author, Double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    // 오버라이딩 - 책 정보 출력 매서드
    @Override
    void displayInfo() {
        super.displayInfo(); // 부모클래스 메서드 호출
        System.out.println("파일 크기 : "+ fileSize + "MB");
    }

//    void returnBook() ()

}

public class D_OOP_Practice {
    public static void main(String[] args) {
        // Book 객체 생성
        Book book1 = new Book("작별하지 않는다", "한강");
        book1.displayInfo(); // 제목 : 작별하지 않는다, 자지 : 한강, 대여 가능 여부 : 대여 가능
        book1.borrowBook(); // 책 대여가 성공적으로 완료되었습니다.
        book1.borrowBook(); // 현재 대여 중입니다. (대여 X)
        book1.returnBook(); // 책 반납이 성공적으로 완료되었습니다.
        book1.returnBook(); // 이미 반납된 상태입니다. (반납 X)

        // Ebook 객체 생성
        Ebook ebook1 = new Ebook("달러구트 꿈 백화점", "이미예", 867.88);
        ebook1.displayInfo(); // 제목 : 달러구트 꿈 백화점, 자지 : 이미예, 대여 가능 여부 : 대여 가능
                              // 파일 크기 : 867.88MB

        ebook1.borrowBook(); // 책 대여가 성공적으로 완료되었습니다.
    }
}
