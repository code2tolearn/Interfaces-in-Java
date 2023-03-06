package interfaces.java8features;

public class Test  implements it1 , it2 {
    public static void main(String[] args) {
        Test t = new Test() ;
        t.m1();
        t.m2();
        t.m3();
    }

    @Override
    public void m1() {
        System.out.println("m1 method imp");
    }

    @Override
    public void m2() {
        System.out.println("m2 method imp");
    }

    @Override
    public void m3() {
        System.out.println("Default common method");
        it2.super.m3();
    }


//   public void m3(){
//        System.out.println("Common method");
//    }
}
// Up to 1.7 there was abs methods in interfaces but now from 1.8 onwards we have
 // Default , Static, abstract methods  can be there
 interface  it1 {
    public void m1() ;
    void m2() ;
     default void m3(){
         System.out.println("Default method in interfaces it1 ");
     }
}
interface  it2{
    public void m1() ;
    default   void m3(){
        System.out.println("Default method in interface it2 ");
    }
}