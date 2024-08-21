import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roll, subject;

        System.out.println("Enter the number of roll: ");
        roll = sc.nextInt();
        System.out.println("Enter the number of subject");
        subject = sc.nextInt();
        
        int arr[][] = new int[roll][subject];

        for (int i = 0; i < roll; i++) {
            for (int j = 0; j < subject; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < roll; i++) {
            for (int j = 0; j < subject; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}