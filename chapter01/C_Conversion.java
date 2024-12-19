package chapter01;

public class C_Conversion {
    public static void main(String[] args) {
        /*
            자바 형 변환(Type Conversion)
            : 하나의 타입을 다른 타입으로 바꾸는 것

            자료형의 크기에 따른 변환 규칙
            -> 메모리 설계상 정수 타입보다 실수 타입이 더 큼
            byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

            char(2)
            boolean(1)

            short와 char은 크기가 같지만 명시형으로 써주는게 일반적
         */

        // 자동 형 변환 (묵시적)
        // 크기가 큰 자료형으로의 변환
        byte smallBox = 10; // 1byte
        int bigBox = 10000; // 4byte

        // 작은 범위의 타입을 큰 타입의 타입에 넣을 때는 컴파일러가 자동으로 형 변환을 수행
        bigBox = smallBox;
        //

        byte a = smallBox;
        short b = a;
        int c = b;
        long d = c;

        float e = d;
//        char f = e; (묵시적 형변환 X)


        // 강제 형 변환 (명시적)
        // 크기가 작은 자료형으로의 변환
        int number = 1234;
        float fnumber = number;

        float fnumber2 = 1234.123F;
        // 강제 형 변환 방법 : (작은자료형타입)큰데이터값
        int number2 = (int)fnumber2;

        System.out.println(number2); // 1234 (소수점은 버려짐)


        // cf) char 자료형의 형 변환
        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u0061';

        System.out.println(a1); // a
        System.out.println(a2); // a (아스키코드)
        System.out.println(a3); // a (유니코드)

        char example = '가';
        System.out.println((int)example); // 44032
        System.out.println((int)example + 1); // 44033
        System.out.println((char)((int)example + 1)); // 각

        // char 자료형은 음수 표현식 X (아스키코드든 유니코드든)

        long longType = 123456;
        int intType = (int)longType;
        short shortType = (short)intType;
        char charType = (char)shortType;
        System.out.println(charType); // 놓
    }
}
