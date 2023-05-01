import java.io.*;

public class leap {
   
    
        public static void leap(int year)
        {
            boolean is_leapyr=false;
        
        
            if(year%4==0)
            {
                is_leapyr=true;
                if(year%100==0)
                {
                    if(year % 400==0)
                    is_leapyr=true;
                    else
                    is_leapyr=false;
                }
            }
            else
            is_leapyr=false;
            if(!is_leapyr)
            System.out.println(year+"non leap year");
            else
            System.out.println(year+"leap year");

        }
        public static void main(String args[])
            {
                is_leapyr(2000);
                is_leapyr(2002);
            }
        
    }
    

