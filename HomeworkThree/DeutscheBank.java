package Homeworks.Java_advanced_Homework.HomeworkThree;

public class DeutscheBank extends ATM implements Converter {


    public DeutscheBank(int amountInAtm, String currency, boolean hasConverter) {
        super(amountInAtm, currency, hasConverter);
    }
}
