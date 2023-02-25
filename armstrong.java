import java.util.Scanner;
public class armstrong
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    System.out.println("enter the lower limit");
    int lower = input.nextInt();

    System.out.println("enter the upper limit");
    int upper = input.nextInt();
    for(int i = lower;i<=upper;i++)
    {
        int sum = 0;
        int temp =i;
        int numDigits = String.valueOf(i).length();
        for(int j=0;j<numDigits;j++)
        {
            int digit = temp % 10;
            temp / =10;
            sum+ = Math.pow(digit,numDigits);

        }

        if(sum == i)
        {
            System.out.println(i+"is an armstrong number");
        }
    }
}
}
