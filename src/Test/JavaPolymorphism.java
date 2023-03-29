package Test;

public class JavaPolymorphism {
    public void Clothes() {
        System.out.println("We have a variety color and size of clothes.");
    }
}
class Jacket extends JavaPolymorphism {
    public void Clothes() {
        System.out.println("I choose pink jacket with large size.");
    }
}
class Dress extends JavaPolymorphism {
    public void Clothes() {
        System.out.println("I choose yellow polka dot dress with small size.");
    }
}
class Main {
    public static void main(String[] args) {
        JavaPolymorphism myClothes = new JavaPolymorphism();
        JavaPolymorphism myJacket = new Jacket();
        JavaPolymorphism myDress = new Dress();
        myClothes.Clothes();
        myJacket.Clothes();
        myDress.Clothes();
    }
}
