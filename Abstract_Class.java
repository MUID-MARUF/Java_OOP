abstract class object {
    int x;
    String name;

    object(){}
    public abstract void print_info();
}

class object2 extends object {
    object2() {
        System.out.println("Succesfully created an object without values");
    }

    object2(String name, int x) {
        this.name = name;
        this.x = x;
        System.out.println("Succesfully created an object");
    }

    public void print_info() {
        System.out.println(name);
        System.out.println(x);
    }
}

public class Abstract_Class {
    public static void main(String args[]) {

        object2 o1 = new object2("Muid", 10);
        o1.print_info();
    }
}
