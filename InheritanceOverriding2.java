class Animal
{
    public void eat()
    {
        System.out.println("Animal eats everythings.");
    }
    public void age(int x)
    {
        System.out.println("age of animal");
    }
}
class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger hunts and eat.");
    }
    public void age(int x)
    {
        System.out.println("Age is" );
    }
}

public class InheritanceOverriding2 
{
    public static void main(String args[])
    {
        Tiger t=new Tiger();
        t.eat();
        t.age(10);
    }
}
