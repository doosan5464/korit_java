package chapter02;

/*
while문
일반적으로 반복횟수가 지정되지 않을때 사용
조건을 검사하고 true면 코드 블록을 실행

while(조건문) {
    실행 코드;
    (무한 루프를 탈출할 증감식을 보통 넣음)
}
 */

public class D_While {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 5) {
            System.out.println(num);
            num++;
        }

        // while문 내부에서 코드 블럭을 무한 실행 continue
        // while문 코브 블럭을 중단 break

        // === 0부터 20까지의 정수 중에서 홀수만 출력 ===
        int number = 0;
        while (true) { // break를 만나기 전까지 무한 루프
            if(number % 2 == 0) {
                number++;
                continue; // 루프 안에서 continue를 만나면 아래의 코드를 무시하고 다시 조건을 검사. 를 이용해서 다른 if문으로 이동
            } else {
                System.out.println(number);
                number++;
                if(number == 20) break;
            }
        }
        // do while문
        // 무조건 1번은 실행하고 그 다음 조건문을 통해 실행할지 말지 결정함
        num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }
}
