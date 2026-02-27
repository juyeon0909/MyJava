package ch01_variable_operator;

public class ShowJumsu {
    static void main() {
        //학생의 이름, 국어, 영어 점수를 출력하고, 평균도 출력해주는 프로그램을 구현해보세요.
        String name;
        double kor;
        double eng;
        double avg;

        name = "홍길동";
        kor = 40.0;
        eng = 43.0;
        avg = (kor + eng) / 2;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("평균 : " + avg);
    }
}
