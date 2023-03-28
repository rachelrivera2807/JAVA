package Test;

public class JavaStatic {
   /* static int i = 7;
    static String s = "Buon Ma Thuot City";
    public static void main(String args[])
    {
        System.out.println("id: "+i);
        System.out.println("location: "+s);
    }*/

    private static String str = "Dak Lak Province";
    static class MyNestedClass{
        //non-static method
        public void disp() {

            /* If you make the str variable of outer class
             * non-static then you will get compilation error
             * because: a nested static class cannot access non-
             * static members of the outer class.
             */
            System.out.println(str);
        }

    }
    public static void main(String args[])
    {
        /* To create instance of nested class we didn't need the outer
         * class instance but for a regular nested class you would need
         * to create an instance of outer class first
         */
        JavaStatic.MyNestedClass obj = new JavaStatic.MyNestedClass();
        obj.disp();
    }
}

