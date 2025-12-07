import java.util.Scanner;

public class string_compare {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first string");
        String s1 = in.nextLine();
        System.out.println("Enter second string");
        String s2 = in.nextLine();
        System.out.println("Enter third string");
        String s3 = in.nextLine();

        boolean b1 = s1.equals(s2);
        // <<<s1.equals(s2)>>> portion for comparing two strings
        boolean b2 = s1.equals(s3);

        System.out.println(b1);
        System.out.println(b2);

        // Alternative way
        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (s1 == s3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        in.close();
    }
}
