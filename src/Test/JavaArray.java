package Test;

public class JavaArray {
    /*public static void main(String[] args) {

        // create an array
        int[] age = {12, 22, 35, 18, 20};

        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }*/
    public static void main(String[] args) {

        int[] numbers = {2, -9, 7, 5, 12, -13, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        for (int number: numbers) {
            sum += number;
        }

        int arrayLength = numbers.length;

        average =  ((double)sum / (double)arrayLength);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
