class Human1
{
    private String name;
    int age;
    Human1()
    {
        System.out.println("Human class constractor");
    }
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);

    }
}
class Student1 extends Human1
{
void disp()
    {
        System.out.println("The age is: "+ age);
       // System.out.println("The name is: "+name);
    }
}
public class Inheritance2
{
    public static void main(String args[])
    {
        Student1 st=new Student1();
        st.sleep();
        st.disp();
    }
}