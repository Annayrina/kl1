public class Main {
    public static void main(String[] args) {
        Book book1 = new Book( "warAndPeace", 1996, new Author("L", "Tolstoy"));
        Book book2 = new Book("warAndPeace", 1996, new Author("L", "Tolstoy"));
        System.out.println(book2.equals(book1));
    }
}