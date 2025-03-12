package fr.ynov.java.medium;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Albert reporter", 30, "Male", 180f, 75.0f, Person.Nationality.USA);
        person.printPersonDetails();
    }
}
