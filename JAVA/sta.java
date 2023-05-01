class demo {
    String brand;// instance variables
    int price;
    static String name;// the value remains same for every object(thrfr static variables are shared by
                       // diff object
   static//it is called only once no matter how many obj are made
   {
    name="phone";
    System.out.println("in static block");
   }                   
    public demo()
    {
        brand ="";
        price=200;
        System.out.println("in constructor");
    }
    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class sta {
   public static void main(String[] args)
    {
    demo obj1 = new demo();
    obj1.brand = "apple";
    obj1.price = 1500;
    demo.name = "Smart Phone";
    obj1.show();

    demo obj2 = new demo();
    obj2.brand = "samsung";
    obj2.price = 1700;
    demo.name = "smart phone";
    obj2.show();
   }
}
