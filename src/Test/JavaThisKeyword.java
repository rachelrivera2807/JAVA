package Test;
public class JavaThisKeyword {
        private int a, b;
        private JavaThisKeyword( int i, int j ){
            this.a = i;
            this.b = j;
        }
        private JavaThisKeyword(int i){
            this(i, i);
        }
        private JavaThisKeyword(){
            this(0);
        }
        @Override
        public String toString(){
            return this.a + " + " + this.b + "i";
        }
        public static void main( String[] args ) {
            JavaThisKeyword c1 = new JavaThisKeyword(2, 3);
            JavaThisKeyword c2 = new JavaThisKeyword(3);
            JavaThisKeyword c3 = new JavaThisKeyword();

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
        }
    }
