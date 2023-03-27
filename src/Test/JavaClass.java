package Test;

/*ublic class JavaClass {
        String fname = "Thuy";
        String lname = "Hien";
        int age = 22;
        String date = "7/28/2001";

        public static void main(String[] args) {
            JavaClass myObj = new JavaClass();
            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
            System.out.println("Age: " + myObj.age);
            System.out.println("Date of birth: " + myObj.date);
        }

    private void fullThrottle() {
    }

    private void speed(int i) {
    }
}*/
public class JavaClass {

    public void name() {
        System.out.println("My name is Rachel");
    }

    public void age(int age) {
        System.out.println("I'm " + age + " years old");
    }

    public static void main(String[] args) {
        JavaClass myIntro = new JavaClass();
        myIntro.name();
        myIntro.age(22);
    }
}