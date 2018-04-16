package Comparators;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList();
        Person person1 = new Person(12, "Ivan");
        Person person2 = new Person(92, "B");
        Person person3 = new Person(32, "Ruslan");
        Person person4 = new Person(92, "A");
        Person person5 = new Person(2, "Koks");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        Collections.sort(persons);

        Person.print(persons);

        Collections.sort(persons,new CompareNameAgePerson());

        Person.print(persons);
        }

}


