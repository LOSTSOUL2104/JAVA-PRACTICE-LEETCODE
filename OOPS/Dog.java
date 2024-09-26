package OOPS;

public class Dog {
        String name;
        String breed;
        int age;
        String color;

        public Dog(String name, String breed, int age, String color)
        {
            this.name = name;
            this.age = age;
            this.breed = breed;
            this.color = color;
        }

    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public String color()
    {
        return color;
    }
    public int getAge()
    {
        return age;
    }
    @Override
    public String toString()
    {
        return ("Hi , my NAme is : " + this.getName ())+ "My breed is : " + this.getBreed () + "my age is  : " + this.getAge () + "my color is : " + this.color ();
    }
    
    public static void main(String[] args) {
    Dog bru = new Dog ("bru","papi",5,"black");
        System.out.println (bru.toString ());
    }
}

