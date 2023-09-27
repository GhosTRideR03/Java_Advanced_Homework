package Homeworks.Homework_One;

public class Person {
    private String name;
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public Person() {

    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
