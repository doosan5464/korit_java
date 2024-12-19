package chapter14.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_a_ListAndArray {
    public static void main(String[] args) {
         /*
         배열 VS 리스트

         1. Array. 배열
         : 여러 데이터를 하나의 object로 관리하기 위한 자료 구조
         : 0부터 시작하는 저장 순서를 가지며 해당 Index 번호를 통해 데이터를 접근
         : 연속된 메모리 공간에 저장
         - 배열은 정의와 동시에 길이를 지정해야하며 길이를 바꿀 수 없음


         2. List. 리스트
         : 순서가 있는 element(요소)의 모임
         : ArrayList, LinkedList 등이 존재

         - Array의 Index번호가 데이터의 식별자 역할(정적)
           vs List의 Index 번호는 데이터의 저장 위치만 확인하는 의미(동적)

         : 불연속적 메모리 공간을 차지
         : Array와 달리 동적, 배열의 크기가 정해져 있지 않음

         ____________________________________
         +) List<> 타입 변수에는 List.of()와 ArrayList를 통해 생성된 불변 리스트, 가변 리스트 모두 할당 가능
         List.of() 메서드
         : 읽기 전용(불변) 리스트를 생성하는 데 사용
         - 수정 불가(추가, 수정, 변경 불가능), null값을 포함 X
         */
        List<String> immutable = List.of("사과","바나나","체리","김");
        // immutable.add("오렌지"); // error
        // immutable.remove("사과"); // error
        // immutable.set(0, "블루베리"); // error

        List<String> dynamicList = new ArrayList<>();
        dynamicList.add("오렌지");
        dynamicList.add("망고");
        dynamicList.remove("오렌지");
        dynamicList.set(0,"으아");
        System.out.println(dynamicList);

        // 정적으로 만든 리스트지만 동적 리스트에 넣어 동적 리스트로 바꿈
        List<String> changeList = new ArrayList<>(immutable);
        changeList.add("딸기");
        System.out.println(changeList); // [사과, 바나나, 체리, 김, 딸기]

        // 반대의 경우
        List<String> changeList2 = new ArrayList<>();
        changeList2 = List.of("과일", "과일2");
        // changeList2.add("과일3"); // error


        /*
         +) Array.asList()
            : 배열을 리스트로 반환하는 메서드
         */
        List<String> asList = Arrays.asList("사과", "바나나", "키위");
        // asList.add("수박"); // error

        /*
         new ArrayList<>() VS Arrays.asList() VS List.of()

         1. 구현 방식
         생성자 방식 VS Arrays 클래스의 asList 메서드 VS List 인터페이스의 of 메서드

         2. 원소 추가 삭제 (add, remove)
         가능 VS 불가능 VS 불가능

         3. 원소 수정 (set)
         가능 VS 가능 VS 불가능

         4. Arrays.asList() 가 반환하는 리스트는 가짜 ArrayList
                Arrays 클래스 내부에 구현된 별개의 ArrayList (컬렉션 프레임워크 X)
         */
    }
}
