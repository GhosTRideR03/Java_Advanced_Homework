package Homeworks.Java_advanced_Homeworks.HomeworkEight;

import java.util.Comparator;

public class SortByPublisherName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublisher().getPublisherName().compareTo(o2.getPublisher().getPublisherName());
    }
}
