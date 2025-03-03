package oopsPolymorphism;

interface Animal {
    void veg();
    void nonVeg();
}

class Cow implements Animal {
    @Override
    public void veg() {  
        System.out.println("Cow is Vegetarian");
    }

    @Override
    public void nonVeg() {
        System.out.println("Cow is not Non-Veg");
    }
}

public class abstractioninterfacepractice {
    public static void main(String[] args) {
        Cow ig = new Cow();
        ig.veg();
        ig.nonVeg();
    }
}
