package Homeworks.Java_advanced_Homework.HomeworkThree;

import java.util.Scanner;

public class HomeworkThreeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PostBank postBank = new PostBank(10000, "USD", false);
        ReifesenBank reifesenBank = new ReifesenBank(15000, "USD", false);
        Sparkasse sparkasse = new Sparkasse(12000, "USD", false);
        DeutscheBank deutscheBank = new DeutscheBank(14000, "USD", true);
        CreditCard creditCard = new CreditCard(231341, 2233, 50000, "EUR");

        ATM[] atms = {postBank, reifesenBank, sparkasse, deutscheBank};
        for (int i = 0; i < atms.length; i++) {
            if (atms[i].isHasConverter()) {
                System.out.print("Введите пин: ");
                int pin = scanner.nextInt();
                if (deutscheBank.pinCheck(creditCard, pin)) {
                    System.out.print("Пин введен верно! \nВведите сумму для снятия в долларах: ");
                    int amount = scanner.nextInt();
                    int convertedAmount = deutscheBank.convertable(amount/2);
                    deutscheBank.withdrawCash(creditCard,convertedAmount);
                    int x = creditCard.getBalance();
                    creditCard.setBalance(x + amount/2);
                    System.out.println("Ваш баланс: " + creditCard.getBalance() + " " + creditCard.getCurrency());
                    System.out.println("В банкомате осталось: " + deutscheBank.getAmountInAtm() + " " + deutscheBank.getCurrency());
                } else {
                    i--;
                    System.out.println("Попробуйте еще раз");
                }
            }
        }
    }
}
