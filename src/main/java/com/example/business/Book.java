package com.example.business;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    public Book() {
    }

    public Book(String title, String author, int publishedyear) {
        this.title = title;
        this.author = author;
        this.publishedyear = publishedyear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublishedyear() {
        return publishedyear;
    }

    public void setPublishedyear(int publishedyear) {
        this.publishedyear = publishedyear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private int publishedyear;

        public int getAge(Book book){
           return 2024 - book.getPublishedyear();
        }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedyear=" + publishedyear +
                '}';
    }
}