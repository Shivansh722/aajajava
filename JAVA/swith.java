import java.util.Scanner;
public class swith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        switch (N) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
        
            default:
                break;
        }
        sc.close();
    }
}
