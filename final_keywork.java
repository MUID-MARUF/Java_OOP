import java.util.Scanner;
public class final_keywork {
    public static void main(String args[]){

        System.out.println("Enter the permanent value of x");
        Scanner input = new Scanner(System.in);
        final int x = input.nextInt();
        //now, x can never be edited

        System.out.println("The peprmanent value of x is : "+x);

    }

}
