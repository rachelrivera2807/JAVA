package Test;

public class JavaMath {
    public static void main(String[] args) {
        double a = 5.878;
        double b = 1.5;
        double c = 7.34;
        System.out.println(Math.ceil(a)); // Math.ceil() method
        System.out.println(Math.ceil(b)); // Math.ceil() method
        System.out.println(Math.ceil(c)); // Math.ceil() method
        System.out.println(Math.floor(a)); // Math.floor() method
        System.out.println(Math.floor(b)); // Math.floor() method
        System.out.println(Math.floor(c)); // Math.floor() method
        System.out.println(Math.round(a)); // Math.round() method
        System.out.println(Math.round(b)); // Math.round() method
        System.out.println(Math.round(c)); // Math.round() method

        int num1 = 35;
        int num2 = 88;
        System.out.println(Math.min(num1, num2)); // Math.min() with int arguments
        System.out.println(Math.max(num1, num2)); // Math.max() with int arguments
        System.out.println(Math.abs(num1));       // Math.abs() with int arguments

        long num3 = 64532L;
        long num4 = 252324L;
        System.out.println(Math.min(num3, num4)); // Math.min() with long arguments
        System.out.println(Math.max(num3, num4)); // Math.max() with long arguments
        System.out.println(Math.abs(num3));       // Math.abs() with long arguments

        float num5 = 4.5f;
        float num6 = 9.67f;
        System.out.println(Math.min(num5, num6)); // Math.min() with float arguments
        System.out.println(Math.max(num5, num6)); // Math.max() with float arguments
        System.out.println(Math.abs(num5));       // Math.abs() with float arguments

        double num7 = 23.44d;
        double num8 = 32.11d;
        System.out.println(Math.min(num7, num8)); // Math.min() with double arguments
        System.out.println(Math.max(num7, num8)); // Math.max() with double arguments
        System.out.println(Math.abs(num7));       // Math.abs() with double arguments

    }
}
