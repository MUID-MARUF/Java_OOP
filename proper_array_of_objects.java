import java.util.Scanner;

class object {

    String name;
    int ID;

    object() {
    }

    object(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void print_info() {
        System.out.println("The name of object is " + name);
        System.out.println("The ID of object is " + ID);
    }
}

public class proper_array_of_objects {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int array_size;
        System.out.println("How many objects will be there ?");
        array_size = input.nextInt();
        array_size++;

        object[] arr = new object[array_size];

        String namex;
        int IDx;

        int i = 1;
        while (i < array_size) {
            System.out.println("Enter name of object " + i);
            namex = input.nextln();
            input.nextln();
            System.out.println("Enter ID of object " + i);
            IDx = input.nextInt();
            arr[i] = new object(namex, IDx);
            i++;
        }

        System.out.println();
        System.out.println("Output ->");
        System.out.println("-------------------------------");

        int j = 1;
        while (j < array_size) {
            arr[j].print_info();
            j++;
        }
        input.close();
    }
}
