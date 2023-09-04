abstract class VechDemo
{
public abstract void land();
public abstract void water();
public abstract void air();
}
class Transport extends Vehicle
{
public void land()
{
System.out.println("Land Transport");
System.out.println("TRUCK");
System.out.println("LORRY");
}
public void water()
{
System.out.println("Water Transport");
System.out.println("SHIP");
System.out.println("BOAT");
}
public void air()
{
System.out.println("Air Transport");
System.out.println("FLIGHT");
System.out.println("HELICOPTER");
}
}
public class Vehicle
{
public static void main(String[]args)
{
Transport ob = new Transport();
ob.land();
ob.water();
ob.air();
}
}