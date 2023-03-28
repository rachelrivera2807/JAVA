package Test;

public class JavaGarbage {
    public static void main(String args[]){
        JavaGarbage s1=new JavaGarbage();
        JavaGarbage s2=new JavaGarbage();
        s1=null;
        s2=null;
        System.gc();
        System.out.println("object is garbage collected");
    }
}
