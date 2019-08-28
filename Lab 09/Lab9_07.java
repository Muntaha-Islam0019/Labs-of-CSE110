import java.util.*;

public class Lab9_07 {
    
    public static void main(String args []) {
        
        Scanner x = new Scanner(System.in) ;
        
        int sum = 0,  max , min ;
        
        System.out.println ("Please enter a quantity" );
        double Q = x.nextInt();
        
        System.out.println("Please enter a number");
        int num = x.nextInt();
        
        max = num ;
        min = num ; 
        sum = sum+num ;
        
        for(int count=2 ; count<=Q ; ++count) {
            System.out.println("Please enter a number");
            num=x.nextInt();
            
            if(num>max) {
                max=num;
            }
            else if(num<min) {
                min=num;
            }
            sum=sum+num;
        }
        double avg=sum/Q;
        
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Average = "+avg);
    }
}