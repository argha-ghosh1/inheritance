class Human
{
    int age;
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);

    }
}
class Student11 extends Human
{

}
public class Inheritance
{
    public static void main(String args[])
    {
        Student11 st=new Student11();
        st.sleep();
    }
}