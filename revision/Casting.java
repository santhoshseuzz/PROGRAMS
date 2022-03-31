package revision;
 class A {
     void m1(){
            System.out.println("Superclass method");
        }
    }
    class B extends A{
        void m2(){
            System.out.println("Subclass method");
        }
    }
public class Casting {
     public static void main(String[] args){
         A r= (A)new B();
//


         A a = new B();
         B b = (B)a;
         b.m1();
         b.m2();
         r.m1();
         // error
//         B a =(B)new  A();
//         a.m1();
     }

 }

