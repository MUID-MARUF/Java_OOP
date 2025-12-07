public class Loops {
    public static void main(String args[]) {
        // For loop------>
        System.out.println("Entering for loop->");
        int x = 3;
        for (int i = 1; i <= x; i++) {
            System.out.println("Loop no. " + i);
        }

        // While loop---->
        System.out.println();
        System.out.println("Entering while loop->");
        int j = 1;
        while (j <= x) {
            System.out.println("Loop no. " + j);
            j++;
        }
        System.out.println();

        // Do While loop--->
        System.out.println("Entering Do While Loop ->");
        int k = 1;
        do {
            System.out.println("Loop no. " + k);

            k++;

        } while (k <= x);
    }

}
