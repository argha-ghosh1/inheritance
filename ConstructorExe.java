class Demoa1
{
    int a,b;
    public Demoa1()
    {
        System.out.println("parent class constructor");

    }
    public Demoa1(int x,int y)
    {
        System.out.println("parameterized perent class constructor");
        a=x;
        b=y;
    }
}
class Demoa2 extends Demoa1
{
    int m,n;
    public Demoa2()
    {
         this(10,20); 
        System.out.println("Child class constructor");
    }
    public Demoa2(int x,int y)
    {
       //this is used to call the parent class constructor
        System.out.println("parameterized child class constructor");
        m=x;
        n=y;
    }
}
public class ConstructorExe
{
    public static void main(String args[])
    {
        //Demo1 d=new demo1();
        Demoa2 d2=new Demoa2();
    }

}