import java.util.Scanner;

public class Task24
{
    public static void main(String[] args)
    {
        Scanner nn=new Scanner(System.in);
        int inp;
        
        System.out.println("Etner a number: ");
        inp=nn.nextInt();
        
        for(int c=1; c<=inp; c++)
        {
            System.out.print(c);
        }
        for(int c=inp-1; c>=1; c--)
        {
            System.out.print(c);
        }
        System.out.println();
    }
}