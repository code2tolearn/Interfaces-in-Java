package stringmanipulation.stringmemory.wraperclasses;
// There are two ways to create wrappe classes

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        // 1st one constructor approch
       //   Integer i1 = new Integer(10);
         // 2nd one is
        Integer i2 = Integer.valueOf(1000) ;
        System.out.println(i2);
        // all wrapper  classes internally implements toString method so
        System.out.println(i2.toString());
        // To convert Wrapper to Primitive We have
        int x = i2.intValue() ;
        System.out.println(x);

        // String to primitive  parseXXX()
        String s = "200" ;
       //   String to primitive
         int a = Integer.parseInt(s) ;
        System.out.println(a);

        System.out.println(1+2+3+4+"welcome");

        // Wrapper classes
        Integer i = 20 ;
        Integer j = 20 ;
        Integer k = 20  ;
        System.out.println(i==k);
        System.out.println(i.equals(k));
        System.out.println(i!=k);

        Integer x1 = Integer.valueOf(1000);
        Integer x2 =  Integer.valueOf(1000) ;
        System.out.println( "ans:" + (x1==x2));
        System.out.println(x1.equals(x2));

        Integer i1 = 128 ;
        Integer i3 = 128 ;
        System.out.println("..........................................");
        System.out.println(i1==i3);
        System.out.println(i1.equals(i3));
        if(i1==i3)
        {
            System.out.println("same");
        }else {
            System.out.println("Not same");
        }

    }
}
