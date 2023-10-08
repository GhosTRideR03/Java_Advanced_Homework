package Homeworks.Java_advanced_Homeworks.HomeworkThree;

public interface Converter {
    default int convertable(int amount) {
        int usd = amount * 2;
        return usd;
    }
}
