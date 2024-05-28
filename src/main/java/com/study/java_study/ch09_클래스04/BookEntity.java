package com.study.java_study.ch09_클래스04;

public class BookEntity {
    private int bookId;
    private String bookName;
    private String author;
    private String publisher;

    public BookEntity() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public BookEntity(int bookId, String publisher, String bookName, String author) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.bookName = bookName;
        this.author = author;


    }
}
