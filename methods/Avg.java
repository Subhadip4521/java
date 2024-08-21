package methods;
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int result = average(num1, num2);
        System.out.println(result);

        sc.close();
    }
    
    public static int average(int n1, int n2) {
        int avg = (n1 + n2) / 2;
        return avg;
    }
}
