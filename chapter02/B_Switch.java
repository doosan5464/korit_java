package chapter02;

import java.util.Scanner;

public class B_Switch {
    public static void main(String[] args) {
        // swith 조건문
        // 특정 변수의 값에 따라 실행할 코드 블록의 범위를 결정
        // 비교할 변수와 case 값을 비교하여 같은 값일 경우 - 해당 블록부터 끝까지 실행
        // break 에서 switch 종료

        /*
        switch (조건변수) {
            case 조건값1:
                실행할 코드;
                break;
            case 조건값2:
                실행할 코드;
                break;
            case 조건값...:
                실행할 코드...;
                break;
            default:                // else와 같은 역할
                실행할 코드:
        }
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Chapter를 선택해주세요");
        int chapter = sc.nextInt();

        switch (chapter) {
            case 1:
                System.out.println("자바 기본 문법");
                break;
            case 2:
                System.out.println("자바 제어문 - 조건문/반복문");
                break;
            case 3:
                System.out.println("자바 배열");
                break;
            default:
                System.out.println("유효한 Chapter 범위가 아닙니다");
        }

        System.out.println("fruit를 입력해주세요");
        sc.nextLine();
        String fruit = sc.nextLine();
        switch (fruit) {
            case "banana":
                System.out.println("바나나는 노랗다");
                break;
            case "strawberry":
                System.out.println("딸기는 빨갛다");
                break;
            case "grape":
                System.out.println("포도는 보라색이다");
                break;
            default:
                System.out.println("유효한 과일이 아닙니다");
        }

        sc.close();
    }
}
