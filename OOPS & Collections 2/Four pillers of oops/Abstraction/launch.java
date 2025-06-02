package Abstraction;

abstract class Plane{
    abstract public void takeOff();

    abstract public void land();

    abstract public void fly();
}
class Airport extends Plane{
    public void takeOff(){
        System.out.println("Plane is taking off");
    }
    public void land(){
        System.out.println("Plane is landing");
    }
    public void fly(){
        System.out.println("Plane is flying");
    }

}
public class launch {
    public static void main(String[] args) {
         Plane  p = new Airport();
         p.takeOff();
            p.land();
            p.fly();
            
    }
} 
