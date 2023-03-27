package Test;

public class JavaString {
    public static void main(String[] args) {
        String txt = "Hello my name is Rachel! Nice to meet you";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("Rachel"));
        String firstName = "Thuy ";
        String lastName = "Hien";
        System.out.println(firstName.concat(lastName));
    }
}
