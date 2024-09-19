package OOPS;

public class OOPS_2 {
    public static void main(String[] args) {
        int[] numbers = new int[ 5 ];
        String[] names = new String[ 10 ];

        int[] model = new int[ 4 ];
        String[] name = new String[ 10 ];
        float[] mileage = new float[ 5 ];

        Cars[]cars = new Cars[5];

        Cars Priyansh1 = new Cars(2012,"Swift",20.5F);;
        Cars Priyansh2 = new Cars(2010,"safari",9.1F);

        System.out.println (Priyansh1.name);
        System.out.println (Priyansh1.model);
        System.out.println (Priyansh1.mileage);

        System.out.println (Priyansh2.name);
        System.out.println (Priyansh2.model);
        System.out.println (Priyansh2.mileage);

        Cars random = new Cars (Priyansh2);
        System.out.println (random.name);

        Cars random2 = new Cars();
        System.out.println (random2.name);

        Cars one = new Cars();
        Cars two = one;

        one.name = "anything";
        System.out.println (two.name);

    }
}

class Cars {
    int model;
    String name;
    float mileage;


    void greeting() {
        System.out.println ("Hello this is " + this.name + "car brand talking");
    }
    Cars(Cars other){
        this.name = other.name;
        this.model = other.model;
        this.mileage = other.mileage;
    }

    Cars(){
        this(2012,"default", 22.4F);
    }
    Cars(int model,String name,float milleage)
    {
        this.name = name;
        this.model = model;
        this.mileage = milleage;
    }
}