class Aeroplane
{
    public void takeoff()
    {
        System.out. println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane
{
    public  void fly()
    {
        System.out.println("moves lower hide");
    }
    public void CarryGoods()
    {
        System.out.println("CargoPlane carries goods");
        
    }

}
class PassengerPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("moves medium hide");
    }
    public void CarryPassenger()
    {
        System.out.println("Passenger plane carries passengers");
    }
}
class InheritanceOverriding
{
    public static void main(String args[])
    {
        //System.out.println("hello");
        CargoPlane cp=new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.CarryGoods();

        PassengerPlane pp=new PassengerPlane();
        pp.fly();
        pp.takeoff();
        pp.CarryPassenger();
    }
}