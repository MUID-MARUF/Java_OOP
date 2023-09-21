class grandparent{
    String name;
    String type;

    grandparent(){
        System.out.println("Grandparent constructor");
    }
    grandparent(String name, String type){
        System.out.println("Grandparent constructor");
        this.name = name;
        this.type = type;
    }

    public void print_gp(){
        System.out.println(name);
        System.out.println(type);
    }
}
class parent extends grandparent{
    int position;

    parent(){
        System.out.println("Parent Constructor");
    }
    parent(String name, String type, int position){
        System.out.println("Parent Constructor");
        this.name = name;
        this.type = type;
        this.position = position;
    }

        public void print_gp(){
            super.print_gp();
            System.out.println(position);}
}
class child extends parent{
    double rating;
    child(){
        System.out.println("Child constructor");
    }
    child(String name, String type, int position, double rating){
        System.out.println("Child constructor");
        this.name = name;
        this.type = type;
        this.position = position;
        this.rating = rating;
    }
    
    public void print_gp(){
        super.print_gp();
        System.out.println(rating);
    }
}

class all_inheritance{
    public static void main(String args[]){

        child c1 = new child("Muid", "Student", 1237, 2.4);
        c1.print_gp();
    }
}