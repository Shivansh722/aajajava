abstract class car
{
    public abstract void drive();
    public abstract void fly();
     public void playMusic()
    {
        System.out.println("Play Music");
    }
}

abstract class wagonR extends car{
    
    public void drive()//this is an exteded overloaded method
    {
        System.out.println(("Driving.."));
    }
}
class updatedwagonR extends wagonR//concrete class
{
    public void fly() {
       System.out.println("flying");
        
    }

public class abstrct {
    public static void main(String[] args) {
        car obj=new updatedwagonR();
        obj.drive();
        obj.playMusic();
    }
}
}
//it is not compulsary to have an abstract method in abstract class
//you can't create object of abstract class