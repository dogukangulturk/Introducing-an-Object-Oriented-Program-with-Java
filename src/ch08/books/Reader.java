package ch08.books;

public class Reader {
    String name;
    int age;
    char sex;
    Book book;

    public void read(Book book, int x){
        book.currentPage += x;
        if (book.currentPage >= book.page){
            System.out.println("Kitabin sonuna gelmistir.");
        }
    }
}
