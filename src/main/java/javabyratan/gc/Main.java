package javabyratan.gc;

public class Main {
    // There are 4 ways to make an obj eligible for Gc
    public static void main(String[] args) {
        Test t1 = new Test() ;
        Test t2 = new Test() ;
        System.out.println("two objs are created");
        // 1st assign null
        t1 = null ;
        t2 = null ;
        // Immediate call to gc by using
        System.gc();
        //******************************//
        // 2nd approch
        String s1 = String.valueOf(new StringBuffer("sameer"));
        String s2 = String.valueOf(new StringBuffer("ameer")) ;
        s1 = s2 ;
        // s1  original obj is eligible for gc now
        //*************************************//
         // 3rd approch
        new Test() ;
        // when gc method will call  this will destroy as it is eligible for gc noe
        //************************//
        // 4rth Approch

     }
     // 4th approch
     public void m1(){
        Test t3 = new Test() ;
         System.out.println(t3);
         Test2 t1 =  new Test2() ;
          t1.main();

     }
     // when this local method will complete its execution it will automatically
    // destroy the obj t3
    // so after completing main method all the obj created in main will be destroyed

    // Other method to call gc

}
class Test{
    String name ;
    Integer id ;
//    @Override
//     public void finalize(){
//         // this is deprecated in current java version we are using
//        System.out.println("Before obj is actually destroyed ");
//     }

}
class  Test2{
//    public void finalize(){
//        System.out.println("Before obj creation");
//    }

    public void main() {
        Test t1 = new Test() ;
        Runtime r = Runtime.getRuntime() ;
        r.gc();
    }

}
