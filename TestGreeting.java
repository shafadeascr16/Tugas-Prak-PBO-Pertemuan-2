public class TestGreeting {
    public static void main (String[] args) {
        Greeting hello = new Greeting();
        hello.greet();
    }
}

class Greeting {
    public void greet() {
        System.out.println("hi");
    }
}