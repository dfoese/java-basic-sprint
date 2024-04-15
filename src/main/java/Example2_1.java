import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        // 사용자로 부터 두 개의 숫자를 입력 닫는다
            // 두 개의 숫자를 입력할 스캐너 구현
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수는: ");
        double num1 = sc.nextDouble();
        System.out.println("두번째 수는: ");
        double num2 = sc.nextDouble();
        double result;

        result = num1 + num2;
        System.out.println(result);

        result = num1 * num2;
        System.out.println(result);

        result = num1 - num2;
        System.out.println(result);

        if (num2 == 0){
            System.out.println("0으로는 나눌수 없다");
        }else {
            result = num1/num2;
            System.out.println(result);
        }

    }
}
