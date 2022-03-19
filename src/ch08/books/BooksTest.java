package ch08.books;

public class BooksTest {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.name = "Yasar Kemal";
        author1.age = 65;
        author1.nationality = "Turk";

        Book book1 = new Book();
        book1.title = "Ince Memed";
        book1.author = author1;
        book1.page = 250;
        book1.type = "Roman";
        book1.isHardCover = true;

        Reader reader1 = new Reader();
        reader1.name = "Dogukan Gulturk";
        reader1.age = 23;
        reader1.sex = 'E';

        reader1.book = book1;
        reader1.read(book1, 260);
        System.out.println(reader1.book.currentPage);

        System.out.println(book1.getInfo());

        book1.setPage(260);
        System.out.println(book1.getInfo());

    }
}
