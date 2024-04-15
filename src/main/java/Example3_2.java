public class Example3_2 {
    public static void main(String[] args) {
        //1부터 100까지의 정수 중의 짝수만 출력하는 프로그램
        //1부터 100까지 반복할 for문을 사용
        //짝수의 값만 출력해야한다
            //나머지가 2로 나누었을때 0인건 출력
        for (int i = 1; i<= 100; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
