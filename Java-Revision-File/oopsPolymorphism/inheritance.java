package oopsPolymorphism;

class data{
    String name = "Abhisahek Pawar";
    int age = 21;
}

class getdata extends data{
    String email = "abc@gmail.com"; 
}

public class inheritance {
    public static void main(String[] args) {
        getdata id = new getdata();

        System.out.println(id.name);
        System.out.println(id.age);
        System.out.println(id.email);

    }
}
