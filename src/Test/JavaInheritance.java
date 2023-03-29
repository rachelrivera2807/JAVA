package Test;
public class JavaInheritance {
    protected String profession = "Teacher";
    public void name() {
        System.out.println("Hello! My name is Rachel");
    }
}
class Career extends JavaInheritance {
    private String introduce = "My profession is";
    public static void main(String[] args) {
        Career myCar = new Career();
        myCar.name();
        System.out.println(myCar.introduce + " " + myCar.profession);
    }
}
