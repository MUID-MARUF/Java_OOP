class obj{
    String name;
    int age;

    obj(){

    };
    obj(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class array_of_objects {
    public static void main(String args[]){
        obj[] arr = new obj[3];

        for(int i = 0;i<3;i++){
            arr[i] = new obj();
        }
        for(int j=0;j<3 ;j++){

            System.out.println(arr[j].name);
            System.out.println(arr[j].age);
            
        }
    }
}
