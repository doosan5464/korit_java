package chapter14.review;

/*
람다 표현식(Lambda)
: 자바 8 에서 도입된 함수형 프로그래밍 스타일의 표현식
>> 익명 클래스를 간결하게 표현

1. 람다식 사용 방법
(매개변수) -> {실행할 코드}

2. 예시
    1) 매개변수, 반환값이 모두 없는 람다식
    () -> System.out.println("Hello, Lambda!");

    2) 매개변수 1개
    x -> x + x;

    3) 매개변수가 2개 이상
    (a,b) -> a + b;

    4) 실행문이 두 줄 이상
    : 두 줄 이상인 경우 return 키워드가 필수
    () -> {
        System.out.println("Hello, Lambda!");
        return "Hello";
    }
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class B_Lambda {
    public static void main(String[] args) {
        // (int x, int y) -> x + y;
        // () -> System.out.println("Hello, Lambda!");
        // (String s) -> {
        //     System.out.println(S);
        //     return s.length();
        // }

        // === 람다식 사용 예시 ===
        // FuntionalInterface(하나의 추상 메서드만 가지는 인터페이스)와 함께 사용
        List<String> list = Arrays.asList("apple","orange","banana");
//        Collections.sort(list);
        // .sort() : List를 정렬하는 메서드
        // a.compareTo(b) : a와 b 두 개의 값을 비교하여 같을 경우 0
        // +) 포함되어 있을 경우
        //      오름차순 정렬 : 양수, 내림차순 정렬 : 음수
        list.sort((a,b) -> a.compareTo(b));
        System.out.println(list); // [apple, banana, orange]

        /*
         == 함수형 인터페이스 ==
         1) Predicate<T> : boolean test(T t)
         - 주어진 조건을 테스트
         - Stream API 와 결합되어 쓰임
         2) Function<T, R> : R apply(T t)
         - 입력값을 다른 타입으로 변환
         3) Consumer<T> : void accept<T t>
         - 입력값을 소비
         4) Supplier<T> : T get()
         - 값을 반환
         */

        Function<String, Integer> fx = s -> s.length();
        Function<String, String> fx2 = s -> s.toUpperCase();
        Integer result = fx.apply("abcde");
        System.out.println(result); // 5
        String result2 = fx2.apply("abcde");
        System.out.println(result2); // ABCDE

        Function<String, Integer> fx3 = s -> Integer.parseInt(s);
        Integer fx3Result = fx3.apply("10");
        System.out.println(fx3Result); // 10

        Integer data = fx3
                .andThen(d -> d + 100)
                .apply("10");
        System.out.println(data); // 110

        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(10)); // true
        System.out.println(even.test(11)); // false


        // == 메서드 참조 ==
        // : 함수형 인터페이스를 간결하게 표현(매개변수 == 인자 일때)
        // - :: 연산자를 사용하여 기존 메서드를 참조
        List<String> names = Arrays.asList("이승아", "이도경", "김명진");

        // 일반 람다식
        System.out.println("== 일반 람다식 ==");
        names.forEach(name -> System.out.println(name));

        // 메서드 참조
        System.out.println("== 메서드 참조 ==");
        names.forEach(System.out :: println); // System.out 안에 있는 함수들을 :: 참조

        // 1) 정적 메서드 참조

    }
}
