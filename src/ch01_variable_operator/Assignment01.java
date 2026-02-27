package ch01_variable_operator;

public class Assignment01 {
    static void main() {
        //대입 연산자
        int x = 5; //정수형 변수 x에 숫자 5를 대입/할당(assign)해주세요

        System.out.println("x : " + x);

        //x = 3; //숫자 3 덮어쓰기
        //x = x + 3; //산술>대입, 산술이 우선, 누적해서 대입
        //System.out.println("x : " + x);

        x += 3;
        System.out.println("x : " + x);

        x *= 4;
        System.out.println("x : " + x);

        x %= 5;
        System.out.println("x : " + x);

        x -= 1;
        System.out.println("x : " + x);

        x += 5;
        System.out.println("x : " + x);
    }
}
