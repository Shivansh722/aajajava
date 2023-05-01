//JVM : job is to execute a java code at multiple os 
//JVM is platform depent but java is platform independent....JVM understands only byte code 
//java code ---> compiler ---> byte code ---> JVM ---> main(it has signature "public static void main(String a[]")
//java is platform independent because of JVM(WORKS ON A OS),JVM has the resp of running a java code
//you can't run java on ios.....have to maake respective JVM for diff OS
//JDK ---> JRE(JAVA RUNTIME ENVIRONMENTAL(i.e jvm with libraries)) --->JVM
//WORA: WRITE ONCE RUN ANYWHERE
// in java char size is 2 bytes
class hello
{
public static void main(String a[])
{
    System.out.print("hello world");
}
}