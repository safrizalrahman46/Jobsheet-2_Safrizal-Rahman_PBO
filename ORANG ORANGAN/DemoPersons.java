

public class DemoPersons {
    public static void main(String[] args) {
        Personss personss1 = new Personss("Alice", 30);
        Personss personss2 = new Personss("Bob", 25);

        personss1.displayInfo();
        personss2.displayInfo();

        personss1.setName("Safrizal Rahman");
        personss1.setAge(31);

        personss2.setName("EvelynHartanto");
        personss2.setAge(26);

        personss1.displayInfo();
        personss2.displayInfo();
    }
}
