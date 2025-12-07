import java.util.Scanner;

public class EOF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { // means until EOF
            int a = sc.nextInt();

            if (a % 2 == 1) {
                System.out.println("Odd number.");
            } else {
                System.out.println("Even number.");
            }
        }
    }
}