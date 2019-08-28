import java.util.* ;

public class Lab9_05 {
    
    public static void main(String args[]) {
        
    Scanner x=new Scanner(System.in);
    
    for (int count=1 ; count<=20 ; ++ count) {
        
        System.out.println("Please enter a number");
        
        int n=x.nextInt();
        
        if(n%2==0) {
        System.out.println(" even ");
        }
        else {
        System.out.println(" odd ");
        }
    }
    }
}