package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

public class RadioPhone extends PhoneTwo {
    private int ownNumber;


    @Override
    public void call(int number) {
        System.out.println("The phone " + getPhoneName() + " try to make a call to number " + number);
    }

    @Override
    public void receiveCall(int number) {
        System.out.println("The phone " + getPhoneName() + " try to receive a call from number " + number);
    }

    public RadioPhone(String model, int number, int weight) {
        super(model, number, weight);
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
}
