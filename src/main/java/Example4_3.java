public class Example4_3 {
    public static void main(String[] args) {
        //정수 배열의 최댓값
        //정수 배열의 최솟값
        //찾아 출력

        int [] arr = {1,3,5,7}; //값을 넣어주면된다
        int arrMax = arr[0];
        int arrMin = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arrMax < arr[i]) {
                arrMax =  arr[i];
            }
            if(arrMin > arr[i]) {
                arrMin =  arr[i];
            }
        }
        System.out.println(arrMax);
        System.out.println(arrMin);
    }
}