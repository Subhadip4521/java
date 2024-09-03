public class MethodOverLoading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("Dip");
        obj.greeting("Subha",2);
    }
}

class Greet {
    void greeting() {
        System.out.println("Hello");
    }

    void greeting(String name) {
        System.out.println("Hello " + name);
    }

    void greeting(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name);
        }
    }
}
