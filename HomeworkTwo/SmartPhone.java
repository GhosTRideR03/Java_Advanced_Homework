package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

public class SmartPhone extends PhoneTwo {
    private int ownNumber;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    public SmartPhone(String model, int number, int weight) {
        super(model, number, weight);
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
}
