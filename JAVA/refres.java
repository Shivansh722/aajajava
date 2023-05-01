import java.util.Scanner;
public class refres 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }

    }
    
}
