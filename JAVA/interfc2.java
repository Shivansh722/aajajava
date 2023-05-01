import javax.sound.sampled.SourceDataLine;

interface A 
{   int age=4;
    String area="vasant vihar"; //final and static by default
    void show();
    void config();
}
interface x
{
    void run();
}
interface y extends x
{

}
class B implements A,{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run(
        System.out.println("running..");
    )
}
public class interfc2
{
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
    }
}