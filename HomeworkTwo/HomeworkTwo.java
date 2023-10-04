package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

import Homeworks.Java_advanced_Homeworks.Phone;

public class HomeworkTwo {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", 464517, 300);
        smartPhone.setPhoneName("Galaxy S");
        smartPhone.call(smartPhone.getNumber());
        smartPhone.receiveCall(smartPhone.getNumber());
        System.out.println();

        ButtonPhone buttonPhone = new ButtonPhone("Nokia", 223414, 500);
        buttonPhone.setPhoneName("Nokia 23 10");
        buttonPhone.call(buttonPhone.getNumber());
        buttonPhone.receiveCall(buttonPhone.getNumber());
        System.out.println();

        RadioPhone radioPhone = new RadioPhone("Radio Phone", 234412, 400);
        radioPhone.setPhoneName("Radio Phone");
        radioPhone.call(radioPhone.getNumber());
        radioPhone.receiveCall(radioPhone.getNumber());
        System.out.println();

        makeCall(smartPhone, buttonPhone.getNumber());
        receiveCall(buttonPhone,smartPhone.getNumber());
    }

    public static void makeCall(Phone phone, int number) {
        System.out.println("Calling number: " + phone.getModel() + " " + number);
    }

    public static void receiveCall(Phone phone, int number) {
        System.out.println(phone.getModel() + " " + number + " is calling ");
    }
}
