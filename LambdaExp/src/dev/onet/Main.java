package dev.onet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " +lastName;
        }
    }

    public static void main(String[] Args){
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Linus", "vander"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie" , "Brown")
        ));
        // using anonymous class
        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  o1.lastName().compareTo(o2.lastName);
            }
        };

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName));
        System.out.println(people);
    }
}
