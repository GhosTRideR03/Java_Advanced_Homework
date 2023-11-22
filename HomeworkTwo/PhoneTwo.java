package Homeworks.Java_Advanced_Homework.HomeworkTwo;

import Java_advanced.Lessons.Lesson_3.Phone;

public class PhoneTwo extends Phone {


    private String phoneName;

    public String getPhoneName() {
        return phoneName;
    }

    public void call(int number) {
        System.out.println(" try to make a call to number " + number);
    }

    public void receiveCall(int number) {
        System.out.println(" try to receive a call from number " + number);
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public PhoneTwo(String model, int number, int weight) {
        super(model, number, weight);
    }

    @Override
    public void receiveCall() {

    }

}
