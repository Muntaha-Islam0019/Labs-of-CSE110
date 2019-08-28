import java.util.Scanner;

public class task17
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner (System.in);
            
         int height;
        height=sc.nextInt();
        
        
        for(int i=1;i<=height;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if (i==1||i==2||i==height||j==i||j==1)
                {
                    System.out.print(j);
                }
                else
                {System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
            