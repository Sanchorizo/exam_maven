package com.example;

import com.example.business.Book;
import org.testng.Assert;

public class BookTest {

    public static void getAgeTest(){
        Book book = new Book("Le Silmarillion", "J.R.R Tolkien", 1977);
        Assert.assertEquals(book.getAge(book), 47);




    }
}
