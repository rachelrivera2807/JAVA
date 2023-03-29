package Test;

public class JavaAbstraction {
    interface A{
        void a();
        void b();
        void c();
        void d();
    }

    abstract static class B implements A{
        public void c(){System.out.println("This is c");}
    }

    static class X extends B{
        public void a(){System.out.println("This is a");}
        public void b(){System.out.println("This is b");}
        public void d(){System.out.println("This is d");}
    }
        public static void main(String args[]){
            A a=new X();
            a.a();
            a.b();
            a.c();
            a.d();
        }
}
