package tools;
class calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class advcal extends calc//in method OL same method and same parameters is req but in method overiding same method is req but not same parameter
{
     public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}
//this means that subclass is over-riding super class but when it is not there we object goes to search the for the function in the super class
public class calci {
    public static void main(String[] args) {
        advcal obj = new advcal();
        int r1=obj.add(3,4);
        System.out.println(r1);
    }
}
