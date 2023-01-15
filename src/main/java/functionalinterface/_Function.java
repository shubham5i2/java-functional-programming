package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function functional interface
        Integer increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

        Integer multiply = multiplyBy10Function.apply(increment);
        System.out.println(multiply);

        Integer addBy1AndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function).apply(1);
        System.out.println(addBy1AndMultiplyBy10);

        //BiFunction functional interface
        Integer incrementByOneAndMultiply = incrementByOneAndMultiplyBiFunction.apply(2, 5);
        System.out.println(incrementByOneAndMultiply);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToMultiplyBy1, numberToMultiplyBy) -> (numberToMultiplyBy1 + 1) * numberToMultiplyBy;
}
