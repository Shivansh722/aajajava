class human
{
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public void setName(String n)
    {
        name=n;
    }

}
public class encapsuln
{
    public static void main(String[] args) {
        human obj = new human();
        obj.setAge(30);
        obj.setName("shivansh");
        /*obj.age = 11;
        obj.name = "shivansh";*/
        System.out.println(obj.getName()+ ":" + obj.getAge());
    }
}
/*this way we are encapsulating our data inside the method so
 that anyone from outside world can't access it w/o having access to the function/* */
 