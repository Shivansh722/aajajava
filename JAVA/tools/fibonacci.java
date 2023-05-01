//prog for add even fib series till n
import java.io.*;
class fibonacci
{
    static int fib_sum(int n)
    {
        if(n<=0)
        return 0;
        int fib[]=new int[2*n+1];
        fib[0]=0;
        fib[1]=1;
        int s=0;
        for(int j=2;j<=2*n;j++)
        {
            fib[j]=fib[j-1]+fib[j-2];
            if(j%2==0)
            s+=fib[j];

        }
        return s;

    }
    public static void main(String[] args) {
        int n=11;
        System.out.println("Even sum of fibonacci series till number"+n+
        "is"+fib_sum(n));
    }
}