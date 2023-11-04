package Homeworks.Java_advanced_Homeworks.HomeworkEight.TaskOne;

public class Book {

    private String bookName;

    private int numberOfPages;

    private int yearOfPublishing;

    private Author author;

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", yearOfPublishing=" + yearOfPublishing +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    private Publisher publisher;

    public Book(String bookName, int numberOfPages, int yearOfPublishing, Author author, Publisher publisher) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
        this.publisher = publisher;
    }
}
