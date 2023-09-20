class object{
    String name;
    int x;

    object(){

    }

    object(String name, int x){
        this.name = name;
        this.x = x;
    }

    void print_info(){
        System.out.println(name);
        System.out.println(x);
    }
}


public class copy_object {
    public static void main(String args[]){

        object ob1 = new object("Muid", 100);
        object ob2 = new object();

        ob2 = ob1; //Copying ob1 to ob2

        /*Or we can copy data individually
         * ob2.name = ob1.name;
         * ob2.x = ob1.x;*/

        ob2.name = ob1.name;

        ob2.print_info();
    }
    
}
