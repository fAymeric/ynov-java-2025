package fr.ynov.java.medium;

public class Main {
    public static void main(String[] args) {
        //Person person = new Person("Albert reporter", 30, "Male", 180f, 75.0f, Person.Nationality.USA);
        //person.printPersonDetails();
        Quality quality = new Quality(1 , "Skibidi");
        Quality quality2 = new Quality(1 , "Skibidi");
        System.out.println(quality == quality2);
        System.out.println(quality2.equals(quality));
        System.out.println(quality.hashCode() == quality2.hashCode());
    }
}
