package Homeworks.Java_advanced_Homeworks.HomeworkEight;

public class Author {

    private String name;

    private int yearOfBirth;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Author(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}
