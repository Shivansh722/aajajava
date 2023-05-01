enum Laptop
{
    macbook(2000),xps(2200),surface(1500),thinkpad(1234);
    private int price;
    private Laptop(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }

}

public class enumlap {
    public static void main(String[] args) {
        Laptop lap = Laptop.macbook;
        System.out.println(lap+ " : "+ lap.getPrice());
    }
}
