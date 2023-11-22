package Homeworks.Java_Advanced_Homework.HomeworkEight.TaskTwo;

import java.util.Arrays;

public class TaskTwoApp {

    public static void main(String[] args) {

        String[][] array = {{"abc", "last"}, {"pklz", "yelp"}, {"ppza", "znote"}, {"ppza", "xyz"}, {"abc", "alast"}};

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                int tempIndex = 0;
                int comparator = compare(array[i][tempIndex], array[i + 1][tempIndex]);
                while (comparator == 0) {
                    if (tempIndex == array[i].length - 1) {
                        break;
                    }
                    tempIndex++;
                    comparator = compare(array[i][tempIndex], array[i + 1][tempIndex]);
                }
                if (comparator > 0) {
                    String[] temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (String[] strings : array) {
            System.out.print(Arrays.toString(strings) + " ");
        }
    }

    public static int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
