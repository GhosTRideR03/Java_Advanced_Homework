package Homeworks.Java_advanced_Homework.HomeworkThree;

public abstract class ATM {

    private int amountInAtm;
    private String currency;
    private boolean hasConverter;

    public String getCurrency() {
        return currency;
    }

    public boolean isHasConverter() {
        return hasConverter;
    }

    public ATM(int amountInAtm, String currency, boolean hasConverter) {
        this.amountInAtm = amountInAtm;
        this.currency = currency;
        this.hasConverter = hasConverter;
    }

    public void depositCash(CreditCard creditCard, int amount) {
        int x = creditCard.getBalance() + amount;
        creditCard.setBalance(x);
        amountInAtm += amount;
    }

    public boolean pinCheck(CreditCard creditCard, int pin) {
        if (pin == creditCard.getPin()) {
            return true;
        } else {
            return false;
        }
    }

    public void withdrawCash(CreditCard creditCard, int amount) {
        if (amount <= creditCard.getBalance()) {
            if (amountInAtm >= amount) {
                int x = creditCard.getBalance() - amount;
                creditCard.setBalance(x);
                System.out.println("Идет выдача " + amount + " USD, подождите");
                amountInAtm -= amount;
//                System.out.println("Ваш баланс = " + x);
//                System.out.println("В банкомате осталось: " + amountInAtm);
            } else {
                System.out.println("Недостаточно денег в банкомате");
                System.out.println("Ваш баланс = " + creditCard.getBalance());
                System.out.println("В банкомате осталось: " + amountInAtm);
            }
        } else {
            System.out.println("Недостаточно средств на счету!");
        }
    }

    public int getAmountInAtm() {
        return amountInAtm;
    }

    public void setAmountInAtm(int amountInAtm) {
        this.amountInAtm = amountInAtm;
    }
}
