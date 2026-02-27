package ch01_variable_operator;

public class PlusMinus01 {
    static void main() {
        int a = 10, b = 20, c;

        //증감 연산자
         c = ++a + b++; //11+20

        System.out.println("a : " + a); //11
        System.out.println("b : " + b); //21
        System.out.println("c : " + c); //31

        c = a++ + --b ; //11+20
        System.out.println("a : " + a); //12
        System.out.println("b : " + b); //20
        System.out.println("c : " + c); //31

        a = 15;
        b = 12;

        c = --a + --b; //14+11
        System.out.println("a : " + a); //14
        System.out.println("b : " + b); //11
        System.out.println("c : " + c); //25

        a = 10;
        b = 20;
        ++a;
        b--;

        c = ++a + b--; //12+19
        System.out.println("a : " + a); //12
        System.out.println("b : " + b); //18
        System.out.println("c : " + c); //31
    }
}
