package Homeworks.Java_advanced_Homework.HomeworkThree;

public class CreditCard {
    private int number;
    private int pin;

    private String currency;

    private int balance;

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public CreditCard(int number, int pin, int balance, String currency) {
        this.number = number;
        this.pin = pin;
        this.balance = balance;
        this.currency = currency;
    }

    public int getNumber() {

        return number;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }
}
