class human
{
    private int age;
    private String name;
    public human()//normal constructor(default)
    {
        age = 12;
        name = "john";
    }
    public human(int a, String n)//parameterised constructor
    {
        age = a;
        name = n;
    }
    public int getAge()
    {
       return age;
    }
    public void setAge(int age)
    {
        this.age= age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
public class constre
{
    public static void main(String args[])
    {
        human obj = new human();/*every time you create a new object 
        you call the constructor */
        human obj1 = new human(18,"shivansh");
        System.out.println(obj.getName()+ ":" + obj.getAge());
        System.out.println(obj1.getName()+":"+obj1.getAge());
        //obj.setAge(30);
        //obj.setName("reddy");
    }
}