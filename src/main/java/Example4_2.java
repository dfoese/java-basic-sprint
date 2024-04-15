import java.util.Scanner;

public class Example4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //5개를 입력할 변수 필요
        int [] studentScore = new int[5];
        //결과를 담을 변수가 필요
        int result = 0;
        
        for (int i = 0; i < studentScore.length; i++){
            studentScore[i] = sc.nextInt();
            result = result + studentScore[i];
        }
        //평균값 출력
        result = result/studentScore.length;
        System.out.println(result);
    }
}
