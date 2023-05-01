interface computer
{
    void code();
}
class laptop implements computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
class desktop implements computer{
    public void code()
    {
        System.out.println("code,compile,faster");
    }
}
class developer
{
    public void devApp(computer lap)
    {
        lap.code();
    }
}
public class interfce {
    public static void main(String[] args) {
        computer lap = new laptop();
        computer desk = new desktop();
        developer shivansh = new developer();
        shivansh.devApp(desk);
    }
    
}
