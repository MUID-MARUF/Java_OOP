class cl1{
    String name;
    static int var;

    cl1(){

    }

    cl1(String name){
        this.name = name;
    }

    cl1(String name, int var){
        this.name = name;
        this.var = var;
    }

    void print_info(){
        System.out.println(name);
        System.out.println(var);
    }
}


public class static_example {
    public static void main(String args[]){

        cl1 obj1 = new cl1("Muid ", 1237);
        cl1 obj2 = new cl1("Hridoy");
        cl1 obj3 = new cl1("Sazin");

        System.out.println("Printing for object 1");
        obj1.print_info();

        System.out.println("Printing for object 2");
        obj2.print_info();

        System.out.println("Printing for object 3");
        obj3.print_info();

    } 
}
