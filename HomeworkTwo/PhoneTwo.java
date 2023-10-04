package Homeworks.Java_advanced_Homeworks.HomeworkTwo;

public class PhoneTwo extends Homeworks.Java_advanced_Homeworks.Phone {
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
    }
    private String phoneName;
    private int number;

    public void call(int number) {
        this.number = number;
        System.out.println("Try to call number " + number);
    }

    public void receiveCall(int number) {
        this.number = number;
        System.out.println("Try to receive call from " + number);
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public PhoneTwo(String model, int number, int weight) {
        super(model, number, weight);
    }

}
