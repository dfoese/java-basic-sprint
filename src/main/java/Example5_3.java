public class Example5_3 {
    public static void main(String[] args) {
    Person person1 = new Person("jungmin", 30);
    Person person2 = new Person("coding", 21);
    person1.introduce();
    person2.introduce();
    Book book = new Book("자바 기초","누구", 10000);
    book.printPrice();
    book.printAuthor();
    book.printTitle();
    }
}
