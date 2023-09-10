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

}

public class Setter {
    public static void main(String args[]){

        System.out.println("Is it working ?");

    //Creating object with default constructor.
        Book b1 = new Book();

    //Creating object with default constructor.
        Book b2 = new Book("Norse Mythology", 500, 34);

        System.out.println("The name of book 1 is "+b1.bookName);
        System.out.println("The page number of book 1 is "+b1.pages);
        System.out.println("The price of the book 1 is "+b1.price + " USD");

        System.out.println("The name of book 2 is "+b2.bookName);
        System.out.println("The page number of book 2 is "+b2.pages);
        System.out.println("The price of the book 2 is "+b2.price + " USD");

        b1.set_info("Math-1", 150, 16.4);

        System.out.println("The name of book 1 is "+b1.bookName);
        System.out.println("The page number of book 1 is "+b1.pages);
        System.out.println("The price of the book 1 is "+b1.price + " USD");

    }
    
}
