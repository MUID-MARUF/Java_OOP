import java.util.Scanner;

//Bank Account Class define
class BankAccount{
    private String name;
    private int accnum;
    private double balance;

    //Default Constructor
    BankAccount(){
        System.out.println("Succesfully created a bank account.");
    }

    //Parameterized Constructor
    BankAccount(String name, int accnum, double balance){
        System.out.println("Bank accoubnt creation succesfull");
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
    }
        //setter method
    public void set_info(String name, int accnum, double balance){
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
    }
        //getter method
    public void get_info(){
        System.out.println(name);
        System.out.println(accnum);
        System.out.println(balance);
    }

    //Diposit method
    public void doposit(double amount){
        balance = balance + amount;
        System.out.println("DIPOSIT succesfull.");
    }

        //Withdraw method
    public void withdraw(double amount){
        if(balance>=amount)
        {
            balance = balance - amount;
            System.out.println("Withdraw succesfull.");
        }
        else{
            System.out.println("Insufficient Balance !");
        }
    }

        //Transfer method
    public void transfer(BankAccount a1, BankAccount a2, double amount){
        if(a1.balance >= amount){
            a1.balance = a1.balance - amount;
            a2.balance = a2.balance + amount;
            System.out.println("Succesfully transfered.");
        }
    }

}
class BankAccount{
    public static void main(String [] args){
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();

        a1.set_info("Muid", 1, 1000);
        a2.set_info("Sami", 2, 1500);

        a1.transfer(a1, a2, 100);

        a1.get_info();
        a2.get_info();
    }
}