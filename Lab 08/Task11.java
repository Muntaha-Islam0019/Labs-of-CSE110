import java.util.*;

public class Task11
{
    public static void main(String[] args)
    {
        Scanner nn=new Scanner(System.in);
        
        int inp;
        System.out.println("Please enter a number: ");
        inp=nn.nextInt();
        
        for (int i = inp; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= inp; k++)
            { 
                System.out.print(k+"");
            }                                  
            System.out.println();
        }
    }
}