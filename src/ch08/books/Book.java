package ch08.books;

public class Book {
    Author author;
    String title;
    int page;
    String type;
    boolean isHardCover;
    int currentPage;

    public void setPage(int x){
        page = x;
    }

    public String getInfo(){
        String info = "Kitabin yazari  : " + author.name + " Kitabin ismi : " + title + " Kitabin sayfa sayisi : " + page + " Kitabin tipi : " + type;
        return info;
    }
}