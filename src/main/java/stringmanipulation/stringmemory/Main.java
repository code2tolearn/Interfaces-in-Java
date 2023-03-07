package stringmanipulation.stringmemory;

//package stringmanipulation.heapndscp;

public class Main {
    public static void main(String[] args) {
        String s1 = "Shailesh" ;
        String s2 = "NotEqual" ;
        String s3 = "Shailesh" ;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s2);
        // Here the obj created in String pool  before creating new object 1st it will check whether obj is already present in the memory or not
        // "= =" operator compare only reference variable not data
        /* Result
         * false
         * true
         * false
         */
        String v1  = new String("Shailesh") ;
        String v2 = new String("NotEqual" );
        String v3 = new String("Shailesh" );
        System.out.println(v1==v2);
        System.out.println(v1==v3);
        System.out.println(v3==v2);
        // Here the  new obj is created in Heap memory  so duplicate will be allowed
        // "= =" operator here compare data of the two objects
        // result
        /*
         *false
         * false
         * false
         */

    }

}
