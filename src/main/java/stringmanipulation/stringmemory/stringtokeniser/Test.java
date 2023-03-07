package stringmanipulation.stringmemory.stringtokeniser;

import java.util.StringTokenizer;
// Present in java.util package

// remainging all are thee in java.lang package

// String Buffer is thread safe and String Builder is not a Thread safe

public class Test {
    public static void main(String[] args) {
        // legacy class introduce in 1.0
        StringTokenizer st = new StringTokenizer("Hello sir the class is completed") ;
        while (st.hasMoreTokens())
        {
            String s = (String) st.nextToken();
            System.out.println(s) ;
        }
        // with  delim
        StringTokenizer st1 = new StringTokenizer("Hello .sir .how .are you",".") ;
        while (st1.hasMoreElements())
        {
            String s =(String) st1.nextToken() ;
            System.out.println(s) ;
        }
    }
}
