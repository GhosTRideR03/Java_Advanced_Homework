package Homeworks.Java_advanced_Homeworks.HomeworkEight.TaskOne;

import java.util.Comparator;

public class SortByAuthorName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
    }
}
