package chapter09;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // == 생일까지 남은 일수 계산 프로그램 ==
        // : 사용자로부터 생년월일을 입력받고 다가오는 생일까지 남은 일수를 반환


        // 1. 사용자로부터 생년월일 입력 받기 (형식 YYYY-MM-DD)
        System.out.println("사용자로부터 생년월일 입력 받기");

        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] name = temp.split("-");

        LocalDate specificDate = LocalDate.of(Integer.parseInt(name[0]),Integer.parseInt(name[1]),Integer.parseInt(name[2]));

        System.out.println(specificDate);
        // 2. 사용자 입력을 LocalDate로 변환 (formatter)
        System.out.println("사용자 입력을 LocalDate로 변환");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String lll = specificDate.format(formatter); // LocalDate??
        System.out.println(specificDate.format(formatter)); // 2024-12-05 12:28:15

        // 3. 현재 날짜 구하기
        System.out.println("현재 날짜 구하기");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 4. 올해의 생일 계산
        System.out.println("올해의 생일 계산");

        // 2000 -> 2024
//        specificDate.plusYears(24);

        System.out.println(specificDate.plusYears(24));   // 질문. 24 왜 안더해지는지
//        System.out.println(lll.plusYears(24));   // 질문. 24 왜 안더해지는지


        // 5. 생일이 이미 지났다면 내년으로 설정
        System.out.println("생일이 이미 지났다면 내년으로 설정");


        // 6. 남은 일수 계산
        System.out.println("남은 일수 계산");


        // 7. 결과 출력
        System.out.println("결과 출력");

    }
}