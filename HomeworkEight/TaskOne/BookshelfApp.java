package Homeworks.Java_advanced_Homeworks.HomeworkEight.TaskOne;

import java.util.*;

public class BookshelfApp {
    // Уверен можно было намного короче и изящней это все сделать, но я только учусь. За то гуглил только данные по книгам
    // и синтаксис свича :)

    public static void main(String[] args) {

        Book bookOne = new Book("Java for Dummies", 368, 2013,
                new Author("Barry Burd", 1956),
                new Publisher("Wiley Publishing Inc.", 1807));

        Book bookTwo = new Book("Alice in Wonderland", 352, 1865,
                new Author("Lewis Carroll", 1832), new Publisher("Macmillan", 1843));

        Book bookThree = new Book("The Wizard Of Oz", 184, 1900,
                new Author("Lyman Frank Baum", 1856),
                new Publisher("George M. Hill Company", 1893));

        Book bookFour = new Book("Harry Potter and the Sorcerer’s Stone", 320, 1999,
                new Author("Joanne Rowling", 1965),
                new Publisher("Scholastic Corporation", 1920));

        Book bookFive = new Book("The Adventures Of Robin Hood", 320, 1883,
                new Author("Howard Pyle", 1853),
                new Publisher("Charles Scribner's Sons", 1846));

        Book bookSix = new Book("A Wild Sheep Chase", 368, 1982,
                new Author("Haruki Murakami", 1949),
                new Publisher("Kodansha International", 1910));

        Book bookSeven = new Book("Pinocchio", 272, 1883,
                new Author("Carlo Collodi", 1826),
                new Publisher("Corriere dei Piccoli", 1880));

        List<Book> bookList = Arrays.asList(bookOne, bookTwo, bookThree, bookFour, bookFive, bookSix, bookSeven);

        String sortType = sortTypeInputCheck();
        sorter(bookList, sortType);
        for (Book book : bookList) {
            System.out.println(book);
        }


    }

    public static void sorter(List<Book> bookList, String sortType) {
        sortType = sortType.toUpperCase();

        switch (sortType) {
            case ("BOOK NAME") -> {
                SortByBookName sortByBookName = new SortByBookName();
                Collections.sort(bookList, sortByBookName);
                break;
            }
            case ("NUMBER OF PAGES") -> {
                SortByNumberOfPages sortByNumberOfPages = new SortByNumberOfPages();
                Collections.sort(bookList, sortByNumberOfPages);
                break;
            }
            case "YEAR OF PUBLISHING" -> {
                SortByYearOfPublishing sortByYearOfPublishing = new SortByYearOfPublishing();
                Collections.sort(bookList, sortByYearOfPublishing);
                break;
            }
            case "AUTHOR NAME" -> {
                SortByAuthorName sortByAuthorName = new SortByAuthorName();
                Collections.sort(bookList, sortByAuthorName);
                break;
            }
            case "AUTHOR BIRTH" -> {
                SortByAuthorBirth sortByAuthorBirth = new SortByAuthorBirth();
                Collections.sort(bookList, sortByAuthorBirth);
                break;
            }
            case "PUBLISHER NAME" -> {
                SortByPublisherName sortByPublisherName = new SortByPublisherName();
                Collections.sort(bookList, sortByPublisherName);
                break;
            }
            case "PUBLISHER FOUNDATION" -> {
                SortByPulisherFoundation sortByPulisherFoundation = new SortByPulisherFoundation();
                Collections.sort(bookList, sortByPulisherFoundation);
                break;
            }
        }
    }

    private static String sortTypeInputCheck() {
        Scanner scanner = new Scanner(System.in);
        String sortType;
        while (true) {
            System.out.println("Input type of sorting required from this options:\n" +
                    "Book name, Number of pages, Year of publishing, Author name, Author birth, Publisher name," +
                    "Publisher foundation: ");
            sortType = scanner.nextLine();
            if (sortType.equalsIgnoreCase("Book name")) {
                break;
            }
            if (sortType.equalsIgnoreCase("Number of pages")) {
                break;
            }
            if (sortType.equalsIgnoreCase("Year of publishing")) {
                break;
            }
            if (sortType.equalsIgnoreCase("Author name")) {
                break;
            }
            if (sortType.equalsIgnoreCase("Author birth")) {
                break;
            }
            if (sortType.equalsIgnoreCase("Publisher name")) {
                break;
            }
            if (sortType.equalsIgnoreCase("Publisher foundation")) {
                break;
            }
        }
        return sortType;
    }
}
