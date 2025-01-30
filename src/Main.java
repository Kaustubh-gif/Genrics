import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) {
        Holder h1 = new Holder(10);
        h1.setData("Mumbai");
        h1.setData(30.222f);
        h1.setData(new Circle(10, 20, 5));

        HolderNew<Integer> h11 = new HolderNew<>(40);
        // h11.setData("pune"); // This will cause a compilation error if uncommented

        HolderNew<String> h112 = new HolderNew<>("Java");
        // h112.setData(60); // This will cause a compilation error if uncommented

        HolderNew2<Integer, String> h13 = new HolderNew2<>(10, "Java");
        h13.setSdata("SQL");

        HolderNew2<String, String> h14 = new HolderNew2<>("ABC", "DEF");
        h14.setSdata("PQR");
    }
}