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

        int x =Integer.parseInt("7");
        double y = Double.parseDouble("5");
        int z = Integer.parseInt("287",16);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int a = Integer.parseInt("4");
        int b = Integer.parseInt("+8");
        int c = Integer.parseInt("-9");
        int d = Integer.parseInt("69", 18);
        int e = Integer.parseInt("hien", 28);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
