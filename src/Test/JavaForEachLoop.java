package Test;
import java.util.*;
public class JavaForEachLoop {
    public static void main(String[] args){
        int[] arr={7, -2, 13, 28, 0, 47};
        for(int i:arr){
            System.out.println(i);
        }
        int total=0;
        for(int i:arr){
            total=total+i;
        }
        System.out.println("Total: "+total);
        ArrayList<String> list=new ArrayList<>();
        list.add("Laptop");
        list.add("Headphone");
        list.add("Clipboard");
        for(String s:list){
            System.out.println(s);
        }
    }
}
