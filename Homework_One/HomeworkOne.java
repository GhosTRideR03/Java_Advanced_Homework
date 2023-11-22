package Homeworks.Java_Advanced_Homework.Homework_One;

import Homeworks.Java_advanced_Homework.Homework_One.Person;
import Homeworks.Java_advanced_Homework.Homework_One.Phone;

public class HomeworkOne {
    public static void main(String[] args) {

        //Task 1:
        Person johny = new Person();
        johny.setName("Johny");
        johny.setFullName("Johnathan Powers");
        johny.setAge(30);
        johny.move();

        Person ron = new Person("Ron", "Ronald Fletcher", 32);
        ron.talk();

        //Task 2:
        Phone samsung = new Phone("Samsung Galaxy S23", 350, 34611452);
        System.out.println(samsung.getModel());
        System.out.println(samsung.getNumber());
        System.out.println(samsung.getWeight());
        samsung.receiveCall(johny.getName());

        Phone apple = new Phone("Iphone 13", 300, 34441332);
        System.out.println(apple.getModel());
        System.out.println(apple.getNumber());
        System.out.println(apple.getWeight());
        apple.receiveCall(ron.getName());

        Phone xiaomi = new Phone("Redmi", 400, 34555432);
        System.out.println(xiaomi.getModel());
        System.out.println(xiaomi.getNumber());
        System.out.println(xiaomi.getWeight());
        xiaomi.receiveCall(johny.getName());
    }
}
