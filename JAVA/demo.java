class calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}
public class demo
{
    public static void main(String[])
    {
        calculator obj = new calculator();
        int r1 = obj.add(3,4);
        System.out.println((r1));
    }
}