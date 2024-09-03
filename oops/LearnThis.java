public class LearnThis {
    public static void main(String[] args) {
        Complex c = new Complex(2, 3);
        c.print();
        System.out.println(c);
        c.add(c.a, c.b);
    }
}

class Complex {
    int a, b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }
    void print(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    void add(int a, int b) {
        this.a = a;
        this.b = b;
        this.print(a, b);
    }
}
