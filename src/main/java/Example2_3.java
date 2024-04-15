import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //  AND 연산자
        boolean resultAnd = a && b;
        System.out.println("a && b = " + resultAnd);

        // OR 연산자
        boolean resultOr = a || b;
        System.out.println("a || b = " + resultOr);

        // NOT 연산자
        boolean resultNotA =! a;
        System.out.println("!a = " + resultNotA);
    }
}