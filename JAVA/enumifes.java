enum Status{
    running,failed;
}
public class enumifes { 
    public static void main(String[] args) {
        Status s = Status.running;
        switch(s)
        {
            case running:
            System.out.println("All Good");
            case failed:
            System.out.println("Try Again");
            default:
            System.out.println("DONE");
            break;
        }
        /*if(s==Status.running)
        System.out.println("All Good");
        else if(s== Status.failed)
        System.out.println("Try Again");*/

    }
    
}
