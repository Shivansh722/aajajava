public class misc
{   
    public static void main(String[] args) {
       int num1 =4;
       int num2 =5;
       calculator calc = new calculator();

       int res=calc.add(4,5);
       System.out.println(res);
    }
}
class calculator
{   int a;
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
        
    }
   
}