public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        // 뒤에 age는 매개변수의 age
        // this.age 인스턴스 변수의 age
    }
    public void introduce(){
        System.out.printf("제 이름은 %s 제 나이는 %d 입니다",name,age);
    }
}
