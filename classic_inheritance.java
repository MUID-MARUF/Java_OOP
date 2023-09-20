class cl1{
    String name;
    int num;

    cl1(){

    }

    cl1(String name, int num){
        this.name = name;
        this.num = num;
    }

    void print_info(){

        System.out.println(name);
        System.out.println(num);
    }
}

class cl2 extends cl1{
    double num2;

    cl2(){

    }

    cl2(String name, int num, double num2){
        this.name = name;
        this.num = num;
        this.num2 = num2;

    }

    void print_info(){
        System.out.println(name);
        System.out.println(num);
        System.out.println(num2);

    }
}

class classic_inheritance{
    public static void main(String args[]){

        cl2 obj = new cl2("Muid",1237, 3.8);

        obj.print_info();

    }
}