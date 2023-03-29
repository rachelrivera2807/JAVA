package Test;

public class JavaInterface {
    interface Drawable{
        void draw();
        static int cube(int x){return x*x*x;}
    }
    static class Square implements Drawable{
        public void draw(){System.out.println("Drawing square");}
    }
        public static void main(String args[]){
            Drawable d= new Square();
            d.draw();
            System.out.println(Drawable.cube(4));
        }
}
