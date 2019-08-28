import java.util.*;

public class Lab9_09 {
    
    public static void main(String args[]) {
        
        Scanner x=new Scanner(System.in) ; 
        
        System.out.println("Please enter a number") ;
        
        int N = x.nextInt() , sum = 0 ;
        
        for(int div=1 ; div<N ; div++) {
            if(N%div==0) {
                sum=sum+div;
            }
        }
        if(sum==N) {
            System.out.println("Perfect");
        }
        else {
            System.out.println("Not perfect");
        }
    }
}