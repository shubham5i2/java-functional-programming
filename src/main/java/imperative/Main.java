package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Shubham", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Roza", Gender.FEMALE)
        );

        // Imperative approach
        System.out.println("// Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : persons) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        // Declarative approach
        System.out.println("// Declarative approach");
        persons.stream()
                .filter(male -> Gender.MALE.equals(male.gender))
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
