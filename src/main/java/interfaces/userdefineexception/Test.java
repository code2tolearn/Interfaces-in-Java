package interfaces.userdefineexception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InvalidEgeException {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        Marriage obj = new Marriage() ;
        obj.validate(n);
    }
}
class Marriage{
    public  void validate(int age) throws InvalidEgeException{
        if(age>25){
            System.out.println("Eligible for marriage");
        }else {
            throw new InvalidEgeException("You are not Eligible for marriage") ;
        }
    }
}
