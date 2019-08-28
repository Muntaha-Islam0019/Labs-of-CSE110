import java.util.*; 

public class Lab9_08 {
    
    public static void main(String args[]) {
        
        Scanner x=new Scanner(System.in);
        
        System.out.println("Please enter a number");
        int N=x.nextInt(),divcnt=0;
        
        for(int div=1;div<=N;div++) {
            
            if(N%div==0){
                System.out.println (div);
                divcnt++;
            }
        }
        System.out.println("total "+divcnt+" divisors.");
    }
}