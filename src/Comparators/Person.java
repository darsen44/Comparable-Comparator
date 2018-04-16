package Comparators;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private int age;
    private String name;

     public Person(int age, String name) {
         this.age = age;
         this.name = name;
     }

     public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }

    @Override
    public String toString() {
        return "Person[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ']';
    }
    public static void print(Collection persons){
        System.out.println();
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person pers = iterator.next();
            System.out.println(pers.getName() + " " + pers.getAge());
        }
    }
}

