package Comparators;

import java.util.Comparator;

public class CompareNamePerson implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        return person.getName().compareTo(t1.getName());
    }
}


