//final class/method/variable
final class calc
{
public void show()
{
    System.out.println("in a calc show");
}
public void add(int a,int b)
{
    System.out.println(a+b);
}
}
class calc
{
    public final void show()
    {
        System.out.println("By Shivansh");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class advcal extends calc
{
    public void show()
    {
        System.out.println("HOHO ");
    }
}

public class demo
{
    public static void main(String[] args) 
    {
        calc obj = new calc();
        obj.show();
        obj.add(4,5);
    }
}