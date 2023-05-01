import java.util.Scanner;
public class neon 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check");
        int n = sc.nextInt();
        int temp = n*n;
        int numofdigits = String.valueOf(temp).length();
        System.out.println(numofdigits);
        int sum = 0;
        for(int i =0;i<numofdigits;i++)
        {
            int dig = temp %10;
            temp/=10;
            sum +=dig;
        }
        if(sum == n)
        {
            System.out.println("NEON OP");
        }
        else
        {
            System.out.println("NOT NEON");
        }
    }
}
