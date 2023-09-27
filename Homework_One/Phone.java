package Homeworks.Homework_One;

public class Phone {

    private String model;
    private int number;
    private int weight;


    public void receiveCall(String name) {
        System.out.println("Incoming call from " + name);
    }

    public Phone(String model, int number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }
}
