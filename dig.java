public class dig {
    public static void main(String[] args) {
        while(n>0)
        {
            dig=n%10;
            sum+=dig;
            n/=10;
        }
        for(;n>0;n/10)
        {
            dig=n%10;
            sum+=dig;
            
        }
    }
}
