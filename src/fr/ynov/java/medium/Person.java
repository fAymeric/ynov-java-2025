package fr.ynov.java.medium;

public class Person {
    enum Nationality {
        USA,
        CANADA,
        FRANCE
    }
    public String personName;
    public int personAge;
    public String personGender;
    public float personHeight;
    public float personWeight;
    public Nationality nationality;
    public Person(String name, int age, String gender, float height, float weight, Nationality nationality ) {
        this.personName = name;
        this.personAge = age;
        this.personGender = gender;
        this.personHeight = height;
        this.personWeight = weight;
        this.nationality = nationality;
    }
    public void printPersonDetails() {
        System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);
        System.out.println("Gender: " + personGender);
        System.out.println("Height: " + personHeight + " cm");
        System.out.println("Weight: " + personWeight + " kg");
        System.out.println("Nationality: " + nationality);
    }
}
