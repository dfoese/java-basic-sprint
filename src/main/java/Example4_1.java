import java.util.Arrays;

public class Example4_1 {
    public static void main(String[] args) {
        //10개의 정수 값을 저장할 수 있는 배열을 생성하고,
        //정수 값을 저장할 수 있는 배열 -> 정수형 타입 변수
        //10개의 정수 값
        int [] intArray = new int[10];     // 10개의 요소를 넣겠다

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = i + 1;           // 각 요소에 index0부터 차례대로 넣겠다.
        }
        //1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
        System.out.println(Arrays.toString(intArray));
    }
}