package interfaces.clonable;

public class Test implements Cloneable{
    int a =  10  ;
    int b = 20 ;
    public static void main(String[] args) throws CloneNotSupportedException {
         Test t = new Test() ;
        System.out.println("Original Obj:"+t.a+" "+t.b );
          Test cloneObj =  (Test) t.clone() ;
        System.out.println("Cloned Obj:"+cloneObj.a+" "+cloneObj.b);
    }
}
/*
* Marker Interfaces Interface  may may not have  method bt when implemented by class it  adopt certain capabality that is marker interfaces
* clonable , serializable and runnable are the marker interface
* runnable interface contains  run method. when class implements runnable interface  that class become thread class that capabality is given by JVM
*
 */