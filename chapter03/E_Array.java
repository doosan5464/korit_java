package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class E_Array {
    public static void main(String[] args) {
        /*
        크기 10의 ArrayList를 생성, 1~10까지의 숫자를 추가한 뒤 출력
        : 반복문을 사용(1부터 10까지 증가하는 숫자)

        추가한 숫자 중 홀수만 제거하고 결과를 출력

        인덱스 3에 값 50 삽입한 뒤 결과를 출력
         */

        // 에러. 강사님꺼 보고 추가 수정
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            num.add(i);
        }
        for(int i = 0; i < num.size(); i++){    // num.size()를 했어야 했는데 그냥 10으로 했다가 remove를 해서 인덱스가 안맞아서 오류가 떴었음
            int check = num.get(i);
            if(check % 2 != 0) {
                num.remove(i);
            }
        }
        System.out.println(num);
        num.add(3, 50);
        System.out.println(num);
    }
}
