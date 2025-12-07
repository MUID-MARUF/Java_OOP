class LearnJava {
    String name;
    String type;
    int num;

    LearnJava() {
        System.out.println("Default Constructor for LearnJava object.");
    }

    LearnJava(String name, String type, int num) {
        this.name = name;
        this.type = type;
        this.num = num;
    }

    public String toString() {
        return "Name : "+name+" "+"Type : "+type+" "+"Favourite number : "+num;
    }
}

public class LearnToString {
    public static void main(String args[]) {

        LearnJava o1 = new LearnJava("Sami", "Female", 69);
        System.out.println(o1.toString());
    }
}