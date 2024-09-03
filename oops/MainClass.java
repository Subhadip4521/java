public class MainClass {
    public static void main(String[] args) {
        Boys b1 = new Boys();
        b1.work();

        Boys b2 = new Boys();
        b2.name = "Dip";
        System.out.println(b2.name);

    }
}

class Boys {
    String name;
    int age;

    void work() {
        System.out.println("Cooking");
    }
}

class Girls {
    String name;
    int age;

    void work() {
        System.out.println("Playing");
    }
}
