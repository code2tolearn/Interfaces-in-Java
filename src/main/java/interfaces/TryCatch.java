package interfaces;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

          int a = new Finally().m1() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Values to divide the number");
        int n = sc.nextInt() ;

        try{
            System.out.println(10/n);
            System.out.println("Shailesh".charAt(10));
        }catch (Exception e)
        {
            System.out.println("RatanSoft");
        }
        System.out.println("Rest of the code");
        // Try with resource if resource is not through checked exception catch is optional
        try(Scanner s = new Scanner(System.in))
        {
            System.out.println("Try with resource ");
        }
        //  multiple resource can  send with semicolon, If one of the resource send checked exception catch block is  must
        // ***********************************************
            // Finally Block
        System.out.println();
        System.out.println("return value of finally :"+a);
    }
    static class  Finally{
        public int m1(){
            try{
                return  10 ;
            }catch (Exception e){
                return 20 ;
            }
            finally {
                return 30 ;
            }
        }
    }


}
