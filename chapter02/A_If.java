package chapter02;

// 제어문 : 조건문(condition), 반복문(loop)

import java.util.Scanner;

// 조건문 : 프로그래밍의 흐름을 제어하는 데 사용
// 1. if, else, else if,
// 2. switch, case, default
// + continue, break
// 들여쓰기 tab
// 내어쓰기 shift tab
public class A_If {
    public static void main(String[] args) {
        // 1. if문 / else문(= 그 밖에)
        int age = 10;

        /*
        if (조건식) {
            조건이 참인 경우 실행할 코드
        } else {
            위에 조건문이 다 거짓일 경우 실행할 코드
        }
        */

        if(age > 19) {
            System.out.println("성인");
        } else if(age > 13) {
            System.out.println("청소년");
        } else {
            System.out.println("미성년자");
        }

        // 실행될 코드 블럭에 코드가 하나의 구문(;이 1개)이라면 {} 생략 가능
        if(age > 19) System.out.println("주류");
        else if (age > 13) System.out.println("탄산");
        else System.out.println("쥬스");

        // == 조건문 예제 ==
        // : 함수 위치 구하기 문제
        // 1. 스캐너를 사용하여 x, y 변수에 데이터를 저장
        // 2. (x, y) 좌표가 1, 2, 3, 4 사분기 중 어느 위치에 있는지 검사
        // >> 조건문

        // 각 분기의 위치일 경우 functionScope 변수에 몇 사분면인지 할당
        // EX) functionScope = "제1사분면"

        // 조건문 이행 완료 시
        // "결과: " + functionScope 출력
        String functionScope = null; // 각 조건문에서 저장할 문자열값을 담을 변수 선언
        Scanner sc = new Scanner(System.in);

        System.out.println("x좌표 입력");
        int x = sc.nextInt();

        System.out.println("y좌표 입력");
        int y = sc.nextInt();

        if(x>0 && y>0) functionScope = "제1사분면";
        else if(x<0 && y>0) functionScope = "제2사분면";
        else if(x<0 && y<0) functionScope = "제3사분면";
        else functionScope = "제4사분면";

        System.out.println("결과: " + functionScope);
        sc.close();
    }
}
