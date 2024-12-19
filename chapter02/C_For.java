package chapter02;

// 반복문
// 특정 조건이 만족될 때까지 동일한 작업을 반복적으로 실행할 때 사용
// for, while, do-while
public class C_For {
    public static void main(String[] args) {
        /*
        for문
        특정조건이 만족될 때 가지 코드 블럭을 반복 실행
        횟수가 정해져 있을 때 사용
        for(초기화; 조건; 증강){
            조건이 참이면 실행할 코드;
        }
        1. 초기화 : 반복에 사용할 변수
        2. 조건 : 해당 조건이 참인 동안 반복문이 실행
        3. 증감 : 매 반복마다 변수를 증감
        4. 코드 : 조건이 참이면 코드를 실행
        순서 1 2 4 3 / 2 4 3 ....

        for 블럭안에 있는 변수는 지역변수. 밖에서 못씀
         */
        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }
        System.out.println("");
        // == 예제 ==
        // for 반복문을 사용하여 1부터 10까지의 숫자 중에서 짝수만 출력
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0) System.out.print(i);
        }
        // for 반복문을 사용하여 구구단의 일부를 출력하는 코드
        System.out.println();
        System.out.println("===3단===");
        // 3 x 1 = 3 으로 출력
        int num = 3;
        for(int i = 1; i <= 9; i++){
            int result = 3 * i;
            System.out.println(num + " x " + i + " = " + result);
        }

        /*
        중첩 반복문
        반복하고 싶은 횟수를 명확하게 확인 하고싶다면
        초기화는 0, 조건을 횟수 미만으로 설정
        *
        == 구구단 전체를 출력하는 코드 ==
        2단 ~ 9단 반복 내부에서 1 ~ 9까지 반복
         */
        for(int i = 0; i < 8; i++) {
            int dan = i + 2; // 2단부터 9단까지 반복
            System.out.println(" [ "+ dan +"단 ] ");
            for(int j = 0; j < 9; j++) {
                int number = j + 1; // 1부터 9까지 반복
                System.out.println(dan + "X" + number + "=" + (dan * number));
            }
        }
        int i = 0; // 같은 스코프(범위)내의 변수가 아니기 때문에 i변수 선언 가능


    }
}
