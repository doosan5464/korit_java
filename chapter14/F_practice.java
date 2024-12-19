package chapter14;

// == 컬렉션 프레임워크 & 스트림 API & 람다 표현식 & 메서드 참조 ==


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 1. 학생 목록 필터링 & 정렬
@AllArgsConstructor
@Getter
@ToString
class StudentClasss {
    private String name;
    private int age;
    private double grade;
}

public class F_practice {
    public static void main(String[] args) {

        // 1. 학생 목록 필터링 & 정렬
        List<StudentClasss> studentClasses = Arrays.asList(
                 new StudentClasss("이승아",22,4.3),
                 new StudentClasss("이승이",23,4.1),
                 new StudentClasss("이승악",24,3.8),
                 new StudentClasss("이승알",25,3.5)
        );

        // 1-1. 4.0 이상의 학점의 학생 필터링
        List<StudentClasss> filteredStudents = studentClasses.stream()
                .filter(student -> student.getGrade() >= 4.0)
                .collect(Collectors.toList());

        System.out.println("학점이 4.0이상인 학생 : ");
        filteredStudents.forEach(System.out::println);

        // 1-2. 학생 이름 목록만 추출
        List<String> studentNames = studentClasses.stream()
                // .map(studentClass -> studentClass.getName())
                .map(StudentClasss::getName)
                .collect(Collectors.toList());

        System.out.println("학생 이름 목록 : ");
        System.out.println(studentNames); // [이승아, 이승이, 이승악, 이승알]

        // 1-3. 학생들을 점수순으로 정렬
        List<StudentClasss> sortedStudents = studentClasses.stream()
                .sorted(Comparator.comparingDouble(StudentClasss::getGrade))
                .collect(Collectors.toList());

        System.out.println("점수 순으로 정렬된 학생들 : ");
        sortedStudents.forEach(System.out::println);
        /*
        StudentClass(name=이승알, age=25, grade=3.5)
        StudentClass(name=이승악, age=24, grade=3.8)
        StudentClass(name=이승이, age=23, grade=4.1)
        StudentClass(name=이승아, age=22, grade=4.3)

         */
        // 1-4. 학생들 중 "아"가 포함된 학생 필터링
        List<StudentClasss> studentWithAh = studentClasses.stream()
                .filter(studentClass -> studentClass.getName().contains("아"))
                .collect(Collectors.toList());

        System.out.println("이름에 '아'가 포함된 학생 : ");
        studentWithAh.forEach(System.out::println); // StudentClass(name=이승아, age=22, grade=4.3)

    }
}
