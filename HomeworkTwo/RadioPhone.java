package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

public class RadioPhone extends PhoneTwo {
    private int ownNumber;

    public RadioPhone(String model, int number, int weight) {
        super(model, number, weight);
    }

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
}
