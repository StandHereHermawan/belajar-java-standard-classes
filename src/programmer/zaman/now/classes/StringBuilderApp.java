package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Arief");
        builder.append(" ");
        builder.append("Karditya");
        builder.append(" ");
        builder.append("Hermawan");

        String name = builder.toString();
        System.out.println(name);
    }
}
