package Homeworks.Java_advanced_Homework.HomeworkSeven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TaskOne {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        long startOne = System.currentTimeMillis();
        for (Integer i : list) {
            int temp = i;
        }
        long endOne = System.currentTimeMillis();
        System.out.println("Time for \"for-each loop\" is: " + (endOne - startOne));

        long startTwo = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = i;
            list.size();
        }
        long endTwo = System.currentTimeMillis();
        System.out.println("Time for \"classic for\" is: " + (endTwo - startTwo));


        long startThree = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = i;
            int size = list.size();
        }
        long endThree = System.currentTimeMillis();
        System.out.println("Time for modified \"classic for\" is: " + (endThree - startThree));


        long startFour = System.currentTimeMillis();
        for (int i = list.size(); i > 0; i--) {
            int temp = i;
            int size = list.size();
        }
        long endFour = System.currentTimeMillis();
        System.out.println("Time for backwords modified \"classic for\"  is: " + (endFour - startFour));

        long startFive = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
        }
        long endFive = System.currentTimeMillis();
        System.out.println("Time for \"While cycle\" with Iterator is: " + (endFive - startFive));


        long startSix = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int i = listIterator.next();
        }
        long endSix = System.currentTimeMillis();
        System.out.println("Time for \"While cycle\" with ListIterator is: " + (endSix - startSix));

        // Previous realization
        long startSeven = System.currentTimeMillis();
        while (listIterator.hasPrevious()) {
            int i = listIterator.previous();
        }
        long endSeven = System.currentTimeMillis();
        System.out.println("Time for \"While cycle\" with backwords ListIterator is: " + (endSeven - startSeven));
    }
}
