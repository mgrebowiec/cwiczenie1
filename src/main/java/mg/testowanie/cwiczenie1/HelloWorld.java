package mg.testowanie.cwiczenie1;

public class HelloWorld {
    public static String greeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello! You don't have a name!";
        }

        return String.format("Hello %s!", name);
    }
}
