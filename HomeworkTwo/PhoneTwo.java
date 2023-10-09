package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

public class PhoneTwo extends Homeworks.Java_advanced_Homeworks.Phone {

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
}
