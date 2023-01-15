package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Shubham", MALE),
                new Person("Alice", FEMALE),
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Rozina", FEMALE)
        );

        //get gender
        persons.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("---------------");

        //get length of name
        persons.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println("---------------");

        //any match
        boolean anyFemale = persons.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(anyFemale);
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
