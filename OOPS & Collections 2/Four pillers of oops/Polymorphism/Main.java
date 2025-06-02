package Polymorphism;

class Plane {  
    public void takeoff() {       
        System.out.println("Plane is taking off");
    }
    public void fly() {
        System.out.println("Plane is flying");
    }
    public void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    public void fly() {    
        System.out.println("CargoPlane is flying lower heights");
    }
    public void carryCargo() {
        System.out.println("CargoPlane is carrying cargo");
    }
}

class PassengerPlane extends Plane {
    public void fly() {    
        System.out.println("PassengerPlane is flying medium heights");
    }
    public void carryPassengers() {
        System.out.println("Passenger plane is carrying Passengers");
    }
}

class FighterPlane extends Plane {
    public void fly() {    
        System.out.println("FighterPlane is flying greater heights");
    }
    public void carryWeapons() {
        System.out.println("FighterPlane plane is carrying Weapons");
    }
}

class Airport {
    public void permit(Plane ref) {   // permit method can accept any type of Plane object
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}

public class Main {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Airport a = new Airport();

        Plane ref;

        ref = cp;
        ref.takeoff();
        ref.fly();
        ref.land();

        ref = pp;
        ref.takeoff();
        ref.fly();
        ref.land();

        ref = fp;
        ref.takeoff();
        ref.fly();
        ref.land();

        a.permit(cp);   
        a.permit(pp);
        a.permit(fp);
    }
}
