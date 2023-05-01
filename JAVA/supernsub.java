class A
{
    public A()
    {
        System.out.println("in A");
    }
}
class B extends A//subclass
{
    public B()
    {
        System.out.println("in B");
    }
}
public class supernsub
{
    public static void main(String[] args) {
        B obj = new B();
    }
}