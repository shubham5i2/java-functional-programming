package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        //Normal java function
        System.out.println(getDBConnectionUrl());

        //Supplier functional interface
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
