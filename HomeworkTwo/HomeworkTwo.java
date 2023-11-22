package Homeworks.Java_Advanced_Homework.HomeworkTwo;

//import Homeworks.Java_Advanced_Homework.HomeworkTwo.ButtonPhone;
//import Homeworks.Java_Advanced_Homework.HomeworkTwo.RadioPhone;
//import Homeworks.Java_Advanced_Homework.HomeworkTwo.SmartPhone;
//import Homeworks.Java_Advanced_Homework.Phone;

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

    public static void makeCall(SmartPhone phone, int number) {
        System.out.println(phone.getPhoneName() + " is calling number: " + number);
    }

    public static void receiveCall(ButtonPhone phone, int number) {
        System.out.println(phone.getPhoneName() + " receiving call from: " + number);
    }
}
