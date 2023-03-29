package Test;

public class JavaConstructor {
        int id;
        String name;
        int age;
        JavaConstructor(int i,String n){
            id = i;
            name = n;
        }
        JavaConstructor(int i,String n,int a){
            id = i;
            name = n;
            age = a;
        }
        void display(){System.out.println(id+": "+name+" "+age+" years old.");}
        public static void main(String [] args){
            JavaConstructor s1 = new JavaConstructor(101,"Rachel", 23);
            JavaConstructor s2 = new JavaConstructor(102,"Daniel",18);
            s1.display();
            s2.display();
        }
}
