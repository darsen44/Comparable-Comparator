package Comparators;

import java.util.Comparator;

public class CompareNameAgePerson implements Comparator<Person> {

    // Sorting by Ages but considering same Names
    @Override
    public int compare(Person person1, Person person2) {
        if(person1.getAge() - person2.getAge() == 0) {
            return person1.getName().compareTo(person2.getName());
        }
        return person1.getAge() - person2.getAge();
    }
}


