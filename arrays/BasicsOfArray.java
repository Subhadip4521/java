import java.util.Scanner;


public class BasicsOfArray {
    public static void main(String[] args) {
        int age[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        // for (int i = 0; i < age.length; i++) {
        //     System.out.print(age[i] + " ");
        // }

        for (int i : age) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
