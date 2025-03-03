package oopsPolymorphism;

interface Hourse {
    void running();    
}

interface cow{
    void eat();
}


class animal implements Hourse , cow{
    @Override
    public void running(){
        System.out.println("Running Call");
    }
    public void eat(){
        System.out.println("Eating Call");
    }
    
} 

public class inheritancemultiple {
    public static void main(String[] args) {
        animal ig = new animal();
        ig.eat();
        ig.running();
    }
}
