package interfaces;

public class Main implements it1 ,it1.it2{
    public static void main(String[] args) {
         Main obj = new Main() ;
         obj.m1();
         obj.m2();
    }

    @Override
    public void m2() {
        System.out.println("Method of inner Interface");
    }

    @Override
    public void m1() {
        System.out.println("Inside method of 2nd Interface");
    }
}
interface it1{
    void m1() ;
    // this is public abs
    interface it2{
        void m2() ;
        // this is public abs
    }
}
