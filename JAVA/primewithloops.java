public class misc 
{
    public static void main(String[] args) {
        int f=0;int n=1;
        for(int i = 1;i<=20;i++)
        {  
            for(int j=1; j<=20;j++)
            {
                if(i%j==0)
                {
                f++;
            
                }
            }
            
            if(f==2)
            System.out.println("num is"+n);
            n++;f=0;
        }
    }
        
}    