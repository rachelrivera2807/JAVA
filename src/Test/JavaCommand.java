package Test;

public class JavaCommand {
    public static void main(String[] args) {
        System.out.println("This is a simple command line program!");
        System.out.println("Your Command Line arguments are:");
        for (String str: args) {
            System.out.println(str);
        }
    }
}

