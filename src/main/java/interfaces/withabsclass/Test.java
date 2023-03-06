package interfaces.withabsclass;
// interfaces in Abstract classs


import interfaces.Main;

import java.rmi.MarshalledObject;

public class Test extends Abc implements Abc.it1{
    public static void main(String[] args) {
         Test t = new Test() ;
           t.m1();
    }

    @Override
    public void m1() {
        System.out.println("Here in the m1");
    }
}
abstract  class  Abc{
     public abstract void m1() ;
     interface it1 {
        public void m1() ;
     }

}
