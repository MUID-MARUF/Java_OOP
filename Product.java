class product{
     String name;
     int quantity;
    double cost;

    product(){
    }

    product(String name, double cost, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;

    }
        //getter
    void set_info(String name, int quantity, double cost){

        this.name = name;
        this.cost = cost;
        this.quantity = quantity;

        System.out.println("Setter succesfully called.");
    }
        //setter method
    void get_info(){
        System.out.println("Name of the product : "+ name);
        System.out.println("Cost of the product per piece: "+cost);
        System.out.println("Available quantity of the product :"+quantity);
    }


    public void buyproduct(int qua){

        if(quantity >= qua){
            double price = cost*qua;
            System.out.println("total cost will be ------ "+price+"------");
        }
        else{
            System.out.println("Not enough products.");
        }

    }

    
}
public class Product {

    public static void main(String args[]){
    
    product p1 = new product("Egg", 10, 2);

    p1.set_info("Egg", 10, 10);

    p1.get_info();

    p1.buyproduct(2);

    }

}
