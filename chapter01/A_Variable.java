package chapter01;

public class A_Variable {
    public static void main(String[] args) {
        // 변수(Variable)
        // 데이터를 저장할 수 있는 메모리 '공간'

        // 1. 변수 선언 : 메모리 공간 생성
        //      변수 선언 방법 (그룹 생성 방법)
        //          -> 데이터타입 변수명;  정수(int num;) 문자(char chr;) 논리_True, False(boolean bool;)

//        num = 10;
//        chr = '가';
//        bool = true;
        // 변수 선언과 동시에 초기화
        // 데이터타입 변수명 = 데이터값

//         2. 변수 초기화(할당)
//         cf) 초기화 : 처음 데이터를 넣는 과정
//             재할당 : 데이터를 바꾸는 과정 / 변수명 = 데이터값;

        int num = 10;
        char character = '가';
        boolean boolValue = true;
        // 변수 명명 규칙
        /*
        문자, 숫자, 기호를 사용
        대소문자를 구분, 길이에 제한 없음 (name과 Name 다름)
        숫자로 시작 못함
        기호는 _(언더스코어), $(달러)만 가능하다
        자바의 예약어, 키워드는 변수명으로 사용 불가능
        LowerCamelCase 사용 권장(시작은 소문자, 이어지는 문자만 대문자)
            전체 대문자 사용을 하지 않음(상수와의 구분을 위해)
         */
//      int 24num = 24;
        int num24 = 24;
        int _24num = 24;
//        int *24num = 24;
        num24 = 48; // 재할당 가능. 변수니까
//        char num24 = '가'; // 재선언은 불가능(한 지역에 같은 이름으로는 x)
        int height = 167;
        height = 169; // 키는 변할수 있는 변수

        // 상수(constant)
        /*
        프로그램 싱행 동안 그 값이 변환되지 않는 변수
        선언과 동시ㅏ에 반드시 초기화가 이루어져야 함
         */

        // 상수 선언 방법
        // final 키워드를 사용하여 함수 선언
        // final 데이터타입 = 데이터값;

        // 상수 명명 규칙
        // UPPER_SNAKE_CASE 사용 - 모든 문자열을 대문자, 연결은 _ 사용
        final int RESIDENT_NUMBER = 1234567;
        final double PI = 3.14159;


    }
}
