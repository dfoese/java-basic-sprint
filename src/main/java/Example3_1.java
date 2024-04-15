import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        // 숫자를 입력받는다.
        // Scanner를 통해 숫자를 입력받는다.
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = sc.nextInt();
        // 숫자가 양수인지 음수 인지 0인지 경우 3개
        if(num < 0){
            System.out.println("음수입니다");
        }else if (num > 0){
            System.out.println("양수입니다");
        }else {
            System.out.println("0입니다");
        }
    }
}
