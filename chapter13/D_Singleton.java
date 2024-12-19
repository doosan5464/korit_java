package chapter13;

/*
=== Singleton 패턴 ===
: 소프트웨어 설계 패턴 중 하나
>> 클래스의 인스턴스가 하나만 생성되도록 보장
>> 해당 클래스의 인스턴스에 전역전 접근을 제공하지만 일관된 상태를 유지

== 싱글톤 패턴의 사용 목적 ==
1) 객체의 유일성을 보장
2) 자원의 절약

== 싱글톤 패턴의 장단점 ==
1) 장점
    - 자원의 중복생성 방지
    - 메모리 사용 최적화
    - 전역 상태를 공유 + 통제된 접근
2) 단점
    - 전역 상태를 관리하고 + 다른 클래스에 영향(결함의 가능성)
    - 테스트가 어려움

class Singleton {
    // static 필드
    // : 클래스 타입 그 자체를 가지는 필드
    private static Singleton instance;

    private Singleton() {}; // 접근제한자를 private 으로 설정하기 위해 생성자 생성
                            // 외부에서 직접적인 인스턴스화 불가능

    // 전역 접근성을 제공하는 메서드 정의 (인스턴스화 담당)
    public static Singleton getInstance() {
        if (instance == null) { // static 필드에 초기화된적이 없다면 인스턴스화 or 있다면 필드 반환
            instance = new Singleton();
        }
        return instance;
    }
}
 */

// 교장 선생님 클래스
class SchoolPrincipal {
   // 유일한 객체를 저장할 변수
   private static SchoolPrincipal instance;

   // 1. 생성자를 private으로 만들어 다른 곳에서 객체 생성이 불가능하도록 설정
    private SchoolPrincipal() {
        System.out.println("교장 선생님 객체 생성!");
    }
    // 2. getInstacne() 메서드를 통해 객체를 제공
    public static SchoolPrincipal getInstance() {
        if (instance == null) {
            instance = new SchoolPrincipal();
        }
        return instance;
    }
    public void announce() {
        System.out.println("공부 열심히 하시고 운동도 열심히 하시고 일찍 자고 일찍 일어나세요");
    }
}


public class D_Singleton {
    public static void main(String[] args) {
        SchoolPrincipal principal1 = SchoolPrincipal.getInstance();
//        SchoolPrincipal principal2 = SchoolPrincipal.getInstance();

        System.out.println(principal1); // chapter13.SchoolPrincipal@49e4cb85
//        System.out.println(principal2); // chapter13.SchoolPrincipal@49e4cb85 같은 객체. 같은 메모리 주소
//        System.out.println(principal1==principal2); // true

        principal1.announce();
    }
}
