package Test;
import java.util.Scanner;
public class JavaPackage {
    public static void main(String[] args) {
        Scanner Intro = new Scanner(System.in);
        System.out.println("Enter your name!");
        String userName = Intro.nextLine();
        System.out.println("My name is " + userName);
        Scanner Intro2 = new Scanner(System.in);
        System.out.println("Enter your age!");
        String userAge = Intro.nextLine();
        System.out.println("I'm " + userAge + " years old");
    }
}
