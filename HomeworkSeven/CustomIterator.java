package Homeworks.Java_advanced_Homeworks.HomeworkSeven;

import java.util.Iterator;

public class CustomIterator implements Iterator {
    private int[] integers;
    int currentIndex = 0;

    public CustomIterator(int[] integers) {
        this.integers = integers;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < integers.length;

    }

    @Override
    public Integer next() {
        int temp = integers[currentIndex];
        currentIndex++;
        return temp;
    }
}