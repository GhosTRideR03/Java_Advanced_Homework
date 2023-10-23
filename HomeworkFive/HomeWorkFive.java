package Homeworks.Java_advanced_Homeworks.HomeworkFive;

import java.util.*;

public class HomeWorkFive {
    public static void main(String[] args) {
        // Task_1:
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(6);
        integerList.add(8);
        integerList.add(10);
        listMultiplier(integerList);
        System.out.println(integerList);

        // Task_2:
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Banana");
        stringList.add("Plane");
        stringList.add("Robotix");
        List<Integer> lengthList = stringListElementLengthCounter(stringList);
        System.out.println(lengthList);

        // Task_3:
        List<Integer> integerListTwo = new ArrayList<>();
        integerListTwo.add(1);
        integerListTwo.add(2);
        integerListTwo.add(3);
        integerListTwo.add(4);
        integerListTwo.add(5);
        integerListTwo.add(6);
        integerListTwo.add(7);
        integerListTwo = oddList(integerListTwo);
        System.out.println(integerListTwo);

        // Task_4: 2 реализации, первая подсмотрел в интернете т.к. не помнил как делать, вторую мучал сам...
        List<String> stringListTwo = new ArrayList<>();
        stringListTwo.add("Hello");
        stringListTwo.add("Hello");
        stringListTwo.add("I'm");
        stringListTwo.add("Bugs");
        stringListTwo.add("Bunny");
        stringListTwo.add("Hello");
        stringListTwo = noDuplicateList(stringListTwo);
        System.out.println(stringListTwo);

        List<String> stringListThree = new ArrayList<>();
        stringListThree.add("Hello");
        stringListThree.add("Hello");
        stringListThree.add("I'm");
        stringListThree.add("I'm");
        stringListThree.add("Iahimovici");
        stringListThree.add("Iahimovici");
        stringListThree.add("Vladislav");
        stringListThree.add("Vladislav");
        stringListThree.add("Hello");
        stringListThree = noDuplicateListTwo(stringListThree);
        System.out.println(stringListThree);
    }

    private static List<String> noDuplicateListTwo(List<String> stringList) {
//        List<String> noDuplicateList = new ArrayList<>();
        for (int j = 0; j < stringList.size(); j++) {
            for (int i = 0 + j; i < stringList.size(); i++) {
                if (j == i) {
                    continue;
                }
                if (stringList.get(j).equalsIgnoreCase(stringList.get(i))) {
                    stringList.remove(i);
                }
            }
        }
        return stringList;
    }


    private static List<String> noDuplicateList(List<String> stringList) {
        Set<String> set = new LinkedHashSet<>(stringList);
        List<String> noDuplicateList = new ArrayList<>(set);
        return noDuplicateList;
    }

    private static List<Integer> oddList(List<Integer> integerList) {
        List<Integer> newIntegerList = new ArrayList<>();
        for (Integer value : integerList) {
            if (value % 2 != 0) {
                newIntegerList.add(value);
            }
        }
        return newIntegerList;
    }

    private static List<Integer> stringListElementLengthCounter(List<String> stringList) {
        List<Integer> lengthList = new ArrayList<>();
        for (String string : stringList) {
            lengthList.add(string.length());
        }
        return lengthList;
    }

    private static List<Integer> listMultiplier(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, integerList.get(i) * 2);
        }
        return integerList;
    }
}
