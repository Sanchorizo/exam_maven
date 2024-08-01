package com.example;

import com.example.business.Book;
import com.example.business.services.BookService;

import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookService bookService = new BookService();
        Book book = new Book("Les Furtifs", "Alain Damasio", 2019);
        bookService.addBook(book);
        List<Book> books = bookService.getBooks();
        for (Book onebook : books ){
            System.out.println(onebook);
        }
    }



}
