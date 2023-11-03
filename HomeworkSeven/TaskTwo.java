package Homeworks.Java_advanced_Homeworks.HomeworkSeven;

public class TaskTwo {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 7, 8, 10, 20, 30};
        CustomIterator customIterator = new CustomIterator(array);

        while (customIterator.hasNext()) {
            System.out.print(customIterator.next() + " ");
        }
    }
}
