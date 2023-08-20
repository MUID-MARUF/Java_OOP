class student{
    String name;
    int roll;
    int age;

    public void print_info(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
    }

    public void setInfo(String name, int roll , int age){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public void setInfo(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

};

public class Polymoirphism {
public static void main(String[] args) {
        student s1 = new student();
        /*s1.name = "Sami";
        s1.roll = 1236;
        s1.age = 27;*/
        String n = "Sami";
        int r = 1236;
        int a = 30;
        s1.setInfo(n, r, a);
        s1.print_info();

        student s2 = new student();
        s2.setInfo("Muid", 1237);
        s2.print_info();
        
    }
}
