package fr.android.androidexercises;

/**
 * Created by Utilisateur on 14/12/2016.
 */

public class Book {

    private String isbn;
    private String title;
    private int price;
    private String cover;

    public Book(String isbn, String title, int price, String cover){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.cover = cover;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

}
