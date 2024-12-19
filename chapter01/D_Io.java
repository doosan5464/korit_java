package chapter01;

import java.util.Scanner;

public class D_Io {
    // 클래스 내부의 실행을 담당하는 메인 메서드 (main 자동완성)
    public static void main(String[] args) {
        // 자바 기본 입출력 (Input, Output - IO)
        // 입력 - 콘솔창을 통해 개발자로부터 입력을 받는 것
        // 출력 - 콘솔창을 통해 데이터를 출력하는 값

        // 출력
        // System.out.println(출력하고자 하는 변수 또는 함수 또는 데이터값);
        System.out.print("안녕하세요");

        // ln : line (주어진 값을 콘솔에 출력하고 줄을 바꿈) \t
        System.out.println("반갑습니다 :)");
        System.out.println("해당줄은?");

        System.out.print("안녕");
        System.out.print("하세요");


        // 입력
        /*
        자바 내장 기능의 Scanner 객체를 사용
        다양한 입력 소스로부터 데이터를 읽을 수 있는 형태
        System.in (콘솔 창에서 표준 입력 스트림을 사용)

        import java.util.Scanner;
         */

        // Scanner 자동완성시 자동으로 import 해줌

        // 스캐너 생성
        // Scanner 변수명 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        // 스캐너 실행
        // 스캐너명.next(); - 입력 내용을 문자열로 반환
        // 스캐너명.nextLine(); - 엔터까지의 전체 라인을 문자열로 반환

        // 스캐너명.nextInt(); -
        // 스캐너명.next데이터타입();

        System.out.println("\n나이(정수)를 입력해주세요");
        int age = sc.nextInt();

        System.out.println("키를 입력해주세요");
        int height = sc.nextInt();

        // 버퍼에 남아있는 엔터를 처리
        sc.nextLine();

        System.out.println("이름을 입력해주세요");   // 여기 입력을 안받고 있음
        String name = sc.nextLine();              // 밑 참고

        System.out.println("입력한 나이: " + age);
        System.out.println("입력한 키: " + height);
        System.out.println("입력한 이름: " + name);


        // 개행 문자 + 버퍼
        // nextInt() or nextDouble()의 경우
        // 버퍼의 개행 문자가 다른 곳의 입력으로 처리되는 문제가 발생 / 개행 문자(\n)는 읽지 않고 그냥 넘겨서임.
        // nextLine() 입력 메서드 호출로 버퍼의 데이터를 사용(앞에 한 번더 써서 없앤다는거임)

        // 스캐너 종료 방법
        // 스캐너 사용 후 메모리 최적화를 위해 스캐너 종료
        // 스캐너명.close();
        sc.close();

//        sc.next(); 에러뜸

    }
}
