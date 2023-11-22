package Homeworks.Java_Advanced_Homework.HomeworkTwo;

public class ButtonPhone extends PhoneTwo {
    private int ownNumber;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(int number) {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber);
        super.call(number);
    }

    @Override
    public void receiveCall(int number) {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber);
        super.receiveCall(number);
    }

    public ButtonPhone(String model, int number, int weight) {
        super(model, number, weight);
    }
}