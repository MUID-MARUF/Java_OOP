import java.util.Scanner;
public class undefined_array{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("What is your array size ?");
        int x = input.nextInt();
        x++;
        String name[] = new String[x];

        for(int i=0; i<x; i++){
            name[i] = input.nextLine();
        }

        for(int j=0; j<x; j++){
            System.out.println(name[j]);
        }
        input.close();
    }
}