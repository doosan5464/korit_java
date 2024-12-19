package chapter10;

/*
=== Set 인터페이스 ===
중복 X, 순서 X
: 중복된 요소를 포함하지 않는 객체의 집합
: 객체의 저장 순서를 저장 않음 (삽입 순서 유지 X)
>> null 요소 포함 가능

== Set 컬렉션 종류 (구현체) ==
1. HashSet
    : 가장 많이 사용되는 Set 구현체, 빠른 데이터 접근, 삽입을 지원
    : 정렬 또는 순서 보장X

2. LinkedHasSet
    : HashSet 에서 순서를 추가한 형태
    : 중복 X, 순서 O

3. TreeSet
    : 데이터가 자동 정렬, 중복 제거와 정렬된 순서유지가 필요할 때
    - 중복 X, 순서 O

cf)List 인터페이스
중복 O, 순서 O,
>> null 요소 포함 가능
["사과", null, "오렌지"]
 */

import java.util.HashSet;
import java.util.Set;

public class D_Set {
    public static void main(String[] args) {
        // === 컬렉션의 주ㅡ요 메서드 ===
        // : add(), remove(), contains(), size(), imEmpty()

        // Set 컬렉션 선언 방법
        // Set<E> set명 = new Set컬렉션종류<>();
        Set<String> exampleSet = new HashSet<>();

        exampleSet.add("자바");
        exampleSet.add("파이썬");
        exampleSet.add("C++");
        exampleSet.add("자바스크립트");
        System.out.println(exampleSet); // // [C++, 파이썬, 자바, 자바스크립트] - 순서가 유지 X

        exampleSet.remove("자바");    // remove(제거하고자 하는 데이터)
        System.out.println(exampleSet); // [C++, 파이썬, 자바스크립트]

        System.out.println(exampleSet.size()); // 3

        exampleSet.add("파이썬");
        System.out.println(exampleSet); // [C++, 파이썬, 자바스크립트] - 중복 X

        System.out.println(exampleSet.contains("자바스크립트")); // true
        System.out.println(exampleSet.contains("자바")); // false

        System.out.println(exampleSet.isEmpty()); // false
        exampleSet.clear();
        System.out.println(exampleSet.isEmpty()); // true
    }
}
