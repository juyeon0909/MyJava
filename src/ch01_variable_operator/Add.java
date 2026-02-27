package ch01_variable_operator;

public class Add {
    static void main() {
        //3 더하기 5는 8입니다.
        //변수 정의(선언)
        int x; //정수형 데이터를 위하여 x를 준비하세요.
        int y;
        int result;
        //변수에 값을 할당(대입)
        x = 3; //쓰기
        y = 5; //쓰기
        result = x + y; //쓰기 + 읽기, + 기호는 덧셈
        System.out.println(result);
        System.out.println("x = " + x); // + 기호는 문자열 결합
        System.out.println("y = " + y);
        System.out.println("result = " + result);
        System.out.println("3 더하기 5는 8입니다");

        //3 더하기 5는 8입니다.
        System.out.println(x + " 더하기 " + y + "는 " + result + "입니다.");

        //4 곱하기 8은 32입니다.
        x = 4; //overwrite
        y = 8; //
        result = x * y;
        System.out.println(x + " 곱하기 " + y + "은 " + result + "입니다.");
    }
}
