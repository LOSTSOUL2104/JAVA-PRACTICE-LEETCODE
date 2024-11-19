package OOPS;

public class OOPS_3 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike ("Petrol", 110, 30); System.out.println (mb.toString ());
    }
}

//Bicycle base class
class VEHICLE {
    public String fuel;
    public int speed;
    public int wheel;

    public VEHICLE(String fuel, int speed, int wheel) {
        this.fuel = fuel; this.speed = speed; this.wheel = wheel;
    }

    public String toString() {
        return ("Number of wheels : " + wheel + " " + "Speed of bicycle is  : " +
                speed + " " + "The fuel type is : " + fuel);
    }
}

//DERIVED CLASSES
class MountainBike extends VEHICLE {
    public int seatHeight;

    public MountainBike(String fuel, int speed, int wheel) {
        super (fuel, speed, wheel);
    }

//    public void setHeight(int newValue) {
//        seatHeight = newValue;
//    }
//
//    public String toString() {
//        return (super.toString () + "Seat height is  : " + seatHeight);
//    }
}
