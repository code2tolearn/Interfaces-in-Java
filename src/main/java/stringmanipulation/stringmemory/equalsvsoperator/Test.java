package stringmanipulation.stringmemory.equalsvsoperator;

public class Test {
    public Test(java.lang.String shailesh) {
    }

    public static void main(String[] args) {
       Test t1 = new Test("Shailesh" );
       Test t2 = new Test("Shailesh") ;
        System.out.println(t1.equals(t2)); //  false
        // Here test class is not implementing equal method so object class method will be implemented so
        // There will be comparison of ref-variable
        // new operator will create new obj and has two ref-verable t1 t2
        System.out.println(t1== t2 ); // false
        System.out.println();

               String s1 = "Shailesh" ;
               String s2 = "Shailesh" ;
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1==s2); // reference to single object of String pool // true
        System.out.println();
        // Here obj will be created  in string pool so
        // String implement equal method that will compare obj contenet
        String str1 = new String("Shradha") ;
        String str2 = new String("Shradha") ;
        System.out.println(str1.equals(str2)); // true
        // compare content of String Method of String class
        System.out.println(str1==str2) ; // false
        // Heap memory will create two obj str1 str2
        // different obj nd so reference
        System.out.println();
        StringBuffer sb = new StringBuffer("anu") ;
        StringBuffer sb1 = new StringBuffer("anu") ;
        System.out.println(sb.equals(sb1)); // false
        // String Buffer do not override equal method so
        // comparison btw reference  ref variable
        System.out.println(sb == sb1 );
        // false
    }
}

//*********************************************//
 class Object{
    public boolean equals(){
        // Reference comparison
        return true ;
    }
 }
// class String extends Object{
//     public String(java.lang.String shradha) {
//         super();
//     }

//     @Override
//     public boolean equals() {
//         // Here  String  override for content comparison
//         return super.equals();
//     }
// }
// class StringBuffer{
//    // It is not overriding the  equal method so parent method of object class will be implemented
//    // Here reference will be  compared here instead data
// }
