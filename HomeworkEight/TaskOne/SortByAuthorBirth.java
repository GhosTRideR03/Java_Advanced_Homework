package Homeworks.Java_Advanced_Homework.HomeworkEight.TaskOne;

import java.util.Comparator;

public class SortByAuthorBirth implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().getYearOfBirth() - o2.getAuthor().getYearOfBirth();
    }
}
