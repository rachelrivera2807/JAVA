package Test;

public class JavaConvert {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        String str2 = "xyz";
        try {
            int num2 = Integer.parseInt(str2);
            System.out.println(num2);
        } catch (NumberFormatException e) {
            System.out.println("Unable to convert string to int.");
        }
    }
}
