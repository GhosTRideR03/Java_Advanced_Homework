package Homeworks.Java_Advanced_Homework.HomeworkEight.TaskOne;

public class Publisher {

    private String  publisherName;

    private int foundationYear;

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public Publisher(String publisherName, int foundationYear) {
        this.publisherName = publisherName;
        this.foundationYear = foundationYear;
    }
}
