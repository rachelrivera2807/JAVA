package Test;

public class JavaSwitch {
    public static void main(String[] args) {
        int month=2;
        String monthString="";
        switch (month) {
            case 1 -> monthString = "1 - January";
            case 2 -> monthString = "2 - February";
            case 3 -> monthString = "3 - March";
            case 4 -> monthString = "4 - April";
            case 5 -> monthString = "5 - May";
            case 6 -> monthString = "6 - June";
            case 7 -> monthString = "7 - July";
            case 8 -> monthString = "8 - August";
            case 9 -> monthString = "9 - September";
            case 10 -> monthString = "10 - October";
            case 11 -> monthString = "11 - November";
            case 12 -> monthString = "12 - December";
            default -> System.out.println("Invalid Month!");
        }
        System.out.println(monthString);

        int number=40;
        switch (number) {
            case 10 -> System.out.println("10");
            case 20 -> System.out.println("20");
            case 30 -> System.out.println("30");
            default -> System.out.println("Not in 10, 20 or 30");
        }
    }
}
