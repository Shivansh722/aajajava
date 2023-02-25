//byte b=124;
//int a=12;
//b=a;wrong as range narrows--->thus type casting is used b=(byte)a;
//a=b;correct as range widens while doing byte to int
 class typeconv 
{
    public static void main(String[] args) {
        //byte b = 257;
        //int a = 257;
        //byte k =(byte)a;
        byte a = 10;
        byte b = 30;
        int res = a*b;
        System.out.println(res);
    }
}
