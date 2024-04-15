import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        // 입력할 콘솔 생성
        Scanner sc = new Scanner(System.in);
        //입력할 콘솔 3개가 정수가 필요
        int [] number= new int[3];
        //3개의 값을 입력
        for (int i = 0; i < number.length; i++){
            number [i] = sc.nextInt();
        }
        //  max에 number[0]의 인덱스 0의 값을 할당
        int max = number[0];
        //  min에 number[0]의 인덱스  0의 값을 할당
        int min = number[0];

        for(int j = 0; j < 3; j++) {
            //최대값 비교
            if(max < number[j]) {
                max = number[j];
            }

            //최소값 비교
            if(min > number[j]) {
                min = number[j];
            }
        }
        System.out.println("가장 큰 값은 : " + max);
        System.out.println("가장 작은 값은 : " + min);
    }
}
