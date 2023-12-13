//Also called as Composition

class A{
    String name;

    A(){}

    A(String name){
        this.name = name;
    }

    String print_A(){
        return name;
    }
}

class B {
    String type;
    A A_variable;

    B(){}

    B(String type){
        this.type = type;
    }

    B(String type, A A_variable){
        this.type = type;
        this.A_variable = A_variable;
    }

    void print_info(){

        System.out.println(A_variable.print_A());
        System.out.println(type);
    }
}
public class MyProgramm {
    public static void main(String args[]){

        A ob_A = new A("Muid");

        B ob1 = new B("Student", ob_A);

        ob1.print_info();


    } 
}
