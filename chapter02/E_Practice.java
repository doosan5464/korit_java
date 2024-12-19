package chapter02;

import java.util.Scanner;

public class E_Practice {
    public static void main(String[] args) {
        /*
        1. 점수에 따른 학점 출력 (if, else if, else 사용)

        사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력하세요.
        0 미만 또는 100 초과인 경우: 유효하지 않은 점수입니다.
        90 이상: A
        80 이상: B
        70 이상: C
        60 이상: D
        그 외: F

        2. 삼각형 모양의 별(*) 출력 (중첩 for 사용)
        (1)
        *
        **
        ***
        ****
        *****
        (2)
            *
           **
          ***
         ****
        *****
    */
        // 왼쪽에 속성 우클릭하고 soft wrap하면 주석이나 코드가 시야밖으로 넘어가는걸 밑으로 넘겨줌
        ////////////////ㄴㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
//        Scanner sc = new Scanner(System.in);
//        System.out.println("점수입력");
//        int score = sc.nextInt();
//        if(score > 100 || score < 0) {
//            System.out.println("유효하지 않은 점수입니다.");
//        } else if (score >= 90) {
//            System.out.println('A');
//        } else if (score >= 80) {
//            System.out.println('B');
//        } else if (score >= 70) {
//            System.out.println('C');
//        } else if (score >= 60) {
//            System.out.println('D');
//        } else {
//            System.out.println('F');
//        }



        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int rows = 5;
        for(int i = 1; i<= rows; i++) {             // 1번재
            for(int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            // (rows-i) + i = 5 즉 한줄에 5개가 유지됨
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row2 = 5;
        for(int i = 1; i<= rows; i++) {             // 1번재
            for(int j = 1; j <= row2; j++) {
                System.out.print("*");
            }
            row2--;
            // (rows-i) + i = 5 즉 한줄에 5개가 유지됨
            for(int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        int row3 = 5;
        for(int i = 1; i<= rows; i++) {             // 1번재
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= row3; j++) {
                System.out.print("*");
            }
            row3--;
            System.out.println();
            // (rows-i) + i = 5 즉 한줄에 5개가 유지됨

        }
        System.out.println();



//        // do-while문 사용 예제
//        // 사용자 입력값을 반복적으로 받아 조건에 맞는 값을 처리할 때 유용
//        int number;
//
//        // 입력값이 1 ~ 10 사이일 때 반복 종료
//        // 이렇게 하면 조건이 틀려도 다시 출력하면서 조건에 맞는 입력을 유도하게 됨. 잘 안씀
//        do {
//            System.out.println("1부터 10사이의 숫자를 입력하세요");
//            number = sc.nextInt();
//        } while(number < 1 || number > 10);
//
//        System.out.println("입력한 숫자는 : " + number);
//        sc.close();
//        // 동일한 입력(System.in)을 여러 번 여는 경우
//        // 표준 입력 스트림을 닫고 재실행 하는 경우 에러가 발생함
//        // 운영체제 지원의 스트림이기 때문에 한 번 닫으면 다시 열 수 없음
    }
}