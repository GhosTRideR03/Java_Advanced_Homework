package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

public class SmartPhone extends PhoneTwo {
    private int ownNumber;

    @Override
    public void receiveCall(int number) {
        System.out.println("The phone " + getPhoneName() + " try to receive a call from number " + super.getNumber());
    }

    @Override
    public void call(int number) {
        System.out.println("The phone " + getPhoneName() + " try to make a call to number " + number);
    }


    public SmartPhone(String model, int number, int weight) {
        super(model, number, weight);
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
