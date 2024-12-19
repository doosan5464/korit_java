package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class F_Array {
    public static void main(String[] args) {

        // ArrayList 생성
        ArrayList<String> items = new ArrayList<>();

        items.add("사과");
        items.add("연필");
        items.add("노트북");
        items.add("시계");
        items.add("텀블러");

        // cf) 난수(무작위의 실수)를 생성하는 Random 기능
        // random.nextInt(숫자값)
        // : 0 < 숫자값 까지의 정수가 생성됨
        Random random =  new Random();
        int index = random.nextInt(items.size());

        // 무작위의 아이템 추출
        String selecetedItem = items.get(index);

        // == 사용자 입력 스캐너 생성 ==
        Scanner scanner = new Scanner(System.in);

        String userGuess; // 반복문 내에서 스캐너를 통해 값 할당

        while (true) {
            System.out.println("아이템을 맞춰보세요.");
            userGuess = scanner.nextLine();

            if(userGuess.equals(selecetedItem)) {
                System.out.println("정답입니다.");
                break;
            } else if (userGuess.equals("종료")) {
                break;
            } else {
                System.out.println("틀렸습니다. 다시 시도하세요.");
            }
        }
        scanner.close();
        System.out.println("종료되었습니다.");
    }
}
