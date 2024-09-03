
public class LearnConstructors {
    public static void main(String[] args) {
        Complex c = new Complex(2, 3);
        c.print();

    }
}

class Complex {
    int a, b;

    public Complex(int real, int imaginary) {
        a = real;
        b = imaginary;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }
}
