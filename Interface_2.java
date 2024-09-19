import java.sql.SQLOutput;
import java.util.Scanner;

public class Interface_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println ("Enter animal name : ");
        String animal = in.next ();
        Pig mypig = new Pig ();
        Dog myDog = new Dog ();
        Sheep mysheep = new Sheep ();
        if (animal.equals("pig"))
        {
            mypig.sound();
            mypig.sleep ();
        }
        else if(animal.equals ("dog")){
            myDog.sound ();
            myDog.sleep ();
        }
        else
        {
            mysheep.sleep ();
            mysheep.sound ();
        }
    }
}
interface  Animal{
    void sound();
    void sleep();
}
class Pig implements Animal{
    public void sound(){
        System.out.println ("pig says hello");
    }
    public void sleep()
    {
        System.out.println ("pig sleeps");
    }
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println ("dog says hello");
    }

    @Override
    public void sleep() {
        System.out.println ("dog sleeps");
    }
}
class Sheep implements Animal{
    @Override
    public void sound()
    {
        System.out.println ("sheep says hello");
    }

    @Override
    public void sleep() {
        System.out.println ("sheep sleeps");
    }
}