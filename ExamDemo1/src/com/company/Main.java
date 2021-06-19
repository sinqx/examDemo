package com.company;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String fullNameAidar = "Мусаев Айдар Нурсултанович", fullNameMaksat = "Азамат уулу", fullNameElina = "Азамат кызы Элина";
        ArrayList<String> people = new ArrayList<>();
        people.add(fullNameAidar);
        people.add(fullNameMaksat);
        people.add(fullNameElina);
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        ArrayList<Person> persons = new ArrayList<>() {};
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        for (int i = 0; i < people.size(); i++) {
            String person = people.get(i);
            StringBuilder name = new StringBuilder();
            StringBuilder lastName = new StringBuilder();
            StringBuilder middleName = new StringBuilder();
            int firstSpace = person.indexOf(" ");
            int secondSpace = person.indexOf(" ", firstSpace + 1);
            System.out.println(secondSpace);
            for (int j = 0; j < firstSpace; j++) {
                name.append(person.charAt(j));
            }
            for (int j = firstSpace; j < secondSpace; j++) {
                lastName.append(person.charAt(j));
            }

            if (secondSpace > 0) {
                for (int j = secondSpace; j < person.length(); j++) {
                    middleName.append(person.charAt(j));
                }
            }
            persons.get(i).setFirstName(name.toString());
            persons.get(i).setLastName(lastName.toString());
            persons.get(i).setMiddleName(middleName.toString());
        }
        System.out.println(person2.lastName);
        System.out.println(person3.middleName);
    }
}
