package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        for(String book : books){
            if(book.matches(".*"+partialBookTitle+".*")){
                printStream.println(book + " ");
            }
        }
        return null;
    }
}
