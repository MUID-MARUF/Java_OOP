import java.util.Scanner;
class Book{
    String bookName;
    int pages;
    double price;

    //to define constructors, we must name the method as the class name and there will be no return type

    //Default constructor.(Excluding printing line)
        Book(){    
            System.out.println("Succesfully created a book object.");
        }

    //parameterized constructor
        Book(String bookName, int pages, double price){

    //this keyword points toward the property of the object through it was called.

        this.bookName = bookName;
        this.pages = pages;
        this.price = price;

        System.out.println("Succesfully created a book object.");
    }

    //Setter method
    void set_info(String bookName, int pages, double price){

        this.bookName = bookName;
        this.pages = pages;
        this.price = price;

        System.out.println("Set data SUCCESFULL !");
    }

    //Setter method with input option.
    //This is also an example of polymorphusm.

    void set_info(){
        Scanner temp = new Scanner(System.in);

        System.out.println("Enter Book Name : ");
        String bookName = temp.nextLine();

        System.out.println("Enter Page Numbers : ");
        int pages = temp.nextInt();

        System.out.println("Enter Book Price : ");
        double price = temp.nextDouble();

        this.bookName = bookName;
        this.pages = pages;
        this.price = price;

        System.out.println("Setting Data Succesfull !");

        temp.close();
    }

    //Getter method
    void get_info(){

        System.out.println("The name of book the is "+bookName);
        System.out.println("The page number of the book is "+pages);
        System.out.println("The price of the book is "+price + " USD");
        
    }
}

public class Scanner_setter {
    public static void main(String args[]){

        System.out.println("Is it working ?");

    //Creating object with default constructor.
        Book b1 = new Book();

    //Creating object with default constructor.
        Book b2 = new Book();

        System.out.println("The name of book 1 is "+b1.bookName);
        System.out.println("The page number of book 1 is "+b1.pages);
        System.out.println("The price of the book 1 is "+b1.price + " USD");

        System.out.println("The name of book 2 is "+b2.bookName);
        System.out.println("The page number of book 2 is "+b2.pages);
        System.out.println("The price of the book 2 is "+b2.price + " USD");

        b1.set_info("Math-1", 150, 16.4);
        b2.set_info();

        b1.get_info();
        b2.get_info();


    }
    
}
