package ch01_variable_operator;

public class PrintMe {
    static void main() {
        //이름 나이 키 몸무게 혈액혈 type 진위
        //변수 정의
        String name; //문자열
        int age; //정수
        double height, weight; //실수
        String blood; //문자열
        char type; //문자
        boolean bool; //참 or 거짓


        name = "김재영"; //"" = 문자열, '' = 믄자
        age = 23;
        height = 173.0;
        weight = 80.0;
        blood = "AB";
        type = 'A'; //'' = 문자, "" = 문자열
        bool = true;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("유형 : " + type);
        System.out.println("진위 : " + bool);



    }
}
