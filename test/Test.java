package test;

// 1번 문제
// - 기본 데이터 타입이 메모리에 새로 값을 저장하는 느낌


// - 참조 데이터 타입은 이미 만들어져 있는 메모리주소를 참조? 솔직히 깊게 잘 모르겠음

// 6번 문제
// : Object

// 7번 문제
// : .size()

// 8번 문제
// : (? true : false)

// 9번 문제
// : 4. 생성자

// 10번 문제
// : 2. 반드시 하나의 추상 메서드 포함

// 11번 문제
// : Parent

// 12번 문제
// : public static

// 13번 문제
// : 아니요

// 14번 문제
// : Dog 클래스가 Animal 클래스를 상속받고 있어야 한다

// 15번 문제
// : 2. 객체 생성 시 복잡한 생성자 호출을 피할 수 있다. (3번도 맞는말?)

// 16번 문제
// : 3. Controller

// 17번 문제
// : public

// 18번 문제
// : 4. 추상 클래스는 정적 메서드를 가질 수 없다.

// 19번
// : 잘 설명하시는거 같습니다



// 20번
// : 예제같은걸 만들때 2개를 만드신다치면 두개의 난이도?가 극단적인것 같아서 그 사이에 중간정도 난이도
// : 예제도 만들면 더 좋을 것 같습니다


import java.util.*;

class Student {
    public String name;
    public int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Test {
    public static void main(String[] args) {
        // 2번 문제
        int num1= 10;
        double num2 = 3.5;
        double result = num1 + num2;
        System.out.println(result);

        // 3번 문제
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp % 2 == 0) System.out.println("입력하신 숫자는 짝수입니다.");
        else if (temp % 2 != 0) System.out.println("입력하신 숫자는 홀수입니다.");

        // 4번 문제
        int[] numbers = {1, 2, 3, 4, 5};
        for (int temp2 : numbers) System.out.println(temp2);

        // 5번 문제
        // : class Test 바로 위에 클래스를 작성하고 main 메서드 내부에서 객체를 생성하세요.
        Student student1 = new Student("John", 85);
        Student student2 = new Student("Jane", 92);
        Student student3 = new Student("Tom", 78);
        Student student4 = new Student("Emily", 88);
        Student student5 = new Student("Ale", 95);

        String[] name = {"John", "Jane", "Tom", "Emily", "Alex"};
        int[] score = {85, 92, 78, 88, 95};

        for(int i = 0; i < 5; i++) {
            if(score[i] >= 90) System.out.println(name[i]);
        }
    }
}