package Polymorphism;

class plane{
    public void takeoff(){       // method
        System.out.println("plane is taking off");
    }
    public void fly(){
        System.out.println("plane is flying");
    }
    public void land(){
        System.out.println("plane is landing");
    }
 }

 class CargoPlane extends plane{
    public void fly(){    // overriding
        System.out.println("CargoPlane is flying lower heights");
    }
    public void carryCargo(){
        System.out.println("CargoPlane is carrying cargo");
    }
 }

 class PassengerPlane extends plane{
    public void fly(){    // overriding
        System.out.println("PassengerPlane is flying medium heights");
    }
    public void carryPassengers(){
        System.out.println("Passenger plane is carrying Passengers");
    }
 }
 class FighterPlane extends plane{
    public void fly(){    // Method overriding
        System.out.println("FighterPlane is flying greater heights");
    }
    public void carryWeapons(){
        System.out.println("FighterPlane plane is carrying Weapons");
    }
 }



public class launch2 {
    public static void main(String[] args) {
        CargoPlane cp= new CargoPlane();
        PassengerPlane pp= new PassengerPlane();
        FighterPlane fp= new FighterPlane();
      // different objects of different classes but reference of same class
      // Polymorphism
        plane ref;
        ref=cp;
        ref.takeoff();
        ref.fly();
        ref.land();

        ref=pp;
        ref.takeoff();
        ref.fly();
        ref.land();

        ref=fp;
        ref.takeoff();
        ref.fly();
        ref.land();

    }
}
