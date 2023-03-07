package stringmanipulation.stringmemory.manipulation;

public class Test {
    public static void main(String[] args) {

        String s = "Shailesh" ; // strings is immutable
        s.concat("+ Gajbhiye") ;
        System.out.println(s);
        // as string is immutable changes in string will not be allowed
        /*
        *Result Shailesh onle
         */
        StringBuffer sb = new StringBuffer("Shailesh") ;
         sb.append("+Gajbhiye") ;
        System.out.println(sb);
        // Here Sb  is mutable

       String str =  s.concat("+Gajbhiye") ;
        System.out.println(str);
        /*
        *Here concat methods is used to combine two objects
        * if we change the reference variable then it can be String  be same
         */
    }
}
