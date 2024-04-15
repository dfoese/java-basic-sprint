import java.util.Scanner;

public class Example3_3 {
    public static void main(String[] args) {
        //사용자로부터 숫자 n을 입력 받는다.
        //1부터 n까지의 합을 출력할 for문 필요 조건은 n까지
        //1부터 n까지 담을 변수를 선언하고 0의 값을 할당
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= num; i++){
            result = result + i;
        }
        System.out.println(result);
    }
}
