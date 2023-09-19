class computer{

    String name;
    int memory;
    int storage;

    computer(){
        System.out.println("Hello from computer !");

        System.out.println(name);
        System.out.println(memory);
        System.out.println(storage);

    }
}

class laptop extends computer{
    int battery_size;

    laptop(){
        System.out.println("Hello from laptop !");

        System.out.println(battery_size);
    }
}


class dynamic_method_dispatching{
{
    public static void main(String args[]){
        System.out.println("Hello world !");

        computer hp = new laptop();
    }
}
