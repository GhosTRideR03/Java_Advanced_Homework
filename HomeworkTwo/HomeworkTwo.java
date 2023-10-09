package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

import Homeworks.Java_advanced_Homeworks.Phone;

public class HomeworkTwo {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", 521, 350);
        smartPhone.setPhoneName("Smart Phone");
        smartPhone.setOwnNumber(464517);
        smartPhone.call(smartPhone.getOwnNumber());

        ButtonPhone buttonPhone = new ButtonPhone("Nokia", 3310, 700);
        buttonPhone.setPhoneName("Super Nokia");
        buttonPhone.setOwnNumber(213616);
        buttonPhone.call(buttonPhone.getOwnNumber());

        RadioPhone radioPhone = new RadioPhone("Radio Phone Type 1", 4400, 1000);
        radioPhone.setPhoneName("Super Type 1");
        radioPhone.setOwnNumber(325404);
        radioPhone.call(radioPhone.getOwnNumber());

        makeCall(smartPhone, buttonPhone.getOwnNumber());
        receiveCall(buttonPhone, smartPhone.getOwnNumber());
    }

    public static void makeCall(PhoneTwo phone, int number) {
        System.out.println(phone.getPhoneName() + " is calling number: " + number);
    }

    public static void receiveCall(PhoneTwo phone, int number) {
        System.out.println(phone.getPhoneName() + " receiving call from: " + number);
    }
}
