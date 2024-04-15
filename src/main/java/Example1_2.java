public class Example1_2 {
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 10;
        System.out.println("합: " + num1 + num2);
        System.out.println("곱: " + num1 * num2);
        System.out.println("빼기: " + (num1 - num2));
        System.out.println("나눗셈: " + (double)num1 / (double)num2);

        double result;
        result = num1 * num2;
        System.out.println(result);
        result = num1 + num2;
        System.out.println(result);
        result = num1 - num2;
        System.out.println(result);
        result = (double)num1 / (double)num2;
        System.out.println(result);
    }
}
