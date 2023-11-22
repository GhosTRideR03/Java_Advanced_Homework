package Homeworks.Java_advanced_Homework.HomeworkThree;

public interface Converter {
    default int convertable(int amount) {
        int usd = amount * 2;
        return usd;
    }
}
