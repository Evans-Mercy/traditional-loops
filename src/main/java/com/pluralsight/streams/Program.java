package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //list of 10 people
        ArrayList<Person> people = new ArrayList<>();
        Person p1 = new Person("Tommy", "Shelby", 30);
        people.add(p1);
        Person p2 = new Person("Authur", "Shelby", 35);
        people.add(p2);
        Person p3 = new Person("Finn", "Shelby", 18);
        people.add(p3);
        Person p4 = new Person("Michael", "Gray", 22);
        people.add(p4);
        Person p5 = new Person("Polly", "Gray", 42);
        people.add(p5);
        Person p6 = new Person("John", "Shelby", 28);
        people.add(p6);
        Person p7 = new Person("Charlie", "Strong", 43);
        people.add(p7);
        Person p8 = new Person("Grace", "Shelby", 28);
        people.add(p8);
        Person p9 = new Person("Ada", "Thorne", 25);
        people.add(p9);
        Person p10 = new Person("Ada", "Shelby", 24);
        people.add(p10);

        //prompt user for a name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first or last name to search: ");
        String searchName = scanner.nextLine();

        //list of people with matching names
        ArrayList<Person> matchingNames = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName)){
                matchingNames.add(person);
            }
        }

        //display matching names
        for (Person person : matchingNames) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        //average, oldest, youngest
        int totalAge = 0;
        int oldest = people.get(0).getAge();
        int youngest = people.get(0).getAge();

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;

            if (age > oldest ){
                oldest = age;
            }
            if (age < youngest) {
                youngest = age;
            }
        }

        double averageAge = (double) totalAge / people.size();
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

    }
}
