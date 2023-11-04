package Homeworks.Java_advanced_Homeworks.HomeworkEight.TaskOne;

import java.util.Comparator;

public class SortByNumberOfPages implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNumberOfPages() - o2.getNumberOfPages();
    }
}
