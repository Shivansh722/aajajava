enum Status{
    runnning, failed, pending, success;//"Status is a class here"
}
public class enum1
{
    public static void main(String[] args) {
        int i= 5;
        Status[] ss = Status.values();
        System.out.println(ss[0]); 
        for(Status s : ss)
        {
            System.out.println(s);
        }
    }
}