import java.util.Scanner;

public class Example1_3 {
    public static void main(String[] args) {
        //입력 받을 이름과 나이 필요
        Scanner sc = new Scanner(System.in);
        //-> 이름 콘솔을 받아온다
        System.out.println("이름은 무엇입니까");
        String name = sc.nextLine();
        //-> 나이를 받아올 콘솔 입력
        System.out.println("나이는 몇살 입니까");
        int age = sc.nextInt();
        System.out.println("이름은:" + name + " " +"나이는" + age);
    }
}
