public class Example5_2 {
    public static void main(String[] args) {
        Book book = new Book("객체지향의 사실과 오해", "조영호", 10000);
        System.out.println(book.price);
        book.price = 10000;
        book.printPrice();
    }
}
