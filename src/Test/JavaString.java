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
        char at = txt.charAt(7);
        System.out.println(at);
        boolean containsRachel = txt.contains("Rachel");
        boolean containsrachel = txt.contains("rachel");
        System.out.println(containsRachel);
        System.out.println(containsrachel);
        boolean endsWithmeet = txt.endsWith("meet");
        boolean endsWithyou = txt.endsWith("you");
        System.out.println(endsWithmeet);
        System.out.println(endsWithyou);
        String txt2 = txt.replace("Hello", "Hi");
        String txt3 = txt.replace('!', ',');
        System.out.println(txt2);
        System.out.println(txt3);
    }
    /*public static void main(String[] args) {
        String str1 = "create";
        String str2 = "program";
        String str3 = "three";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.compareTo(str3));
    }*/
}
