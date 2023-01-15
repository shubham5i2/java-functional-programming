package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        //Normal java function
        System.out.println(isPhoneNumberValid("91034"));
        System.out.println(isPhoneNumberValid("21034"));

        //Predicate functional interface
        System.out.println(isPhoneNumberValidPredicate.test("91034"));
        System.out.println(isPhoneNumberValidPredicate.test("910034"));

        System.out.println("Is phone number valid and contains number 3 " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("91832"));
        System.out.println("Is phone number valid or contains number 3 " +
                isPhoneNumberValidPredicate.or(containsNumber3).test("891802"));

        //BiPredicate functional interface
        System.out.println(nameStartsWithSAndMatchesLength.test("Shubham", 7));
        System.out.println(nameStartsWithSAndMatchesLength.test("Shubham", 8));
        System.out.println(nameStartsWithSAndMatchesLength.test("Manish", 6));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("91") && phoneNumber.length() == 5;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<String, Integer> nameStartsWithSAndMatchesLength = (name, length) ->
            name.startsWith("S") && name.length() == length;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("91") && phoneNumber.length() == 5;
    }
}
