package OOPS;

public class Generic_1 {
    public static void main(String[] args)
    {
        GenericClass<Integer> g1 = new GenericClass<>();
        int id = 21;
        g1.setId(id);

        // System.out.println(g1.getID());
        // char input = 'a';
        // char c = g1.GenMethod(input);
        // System.out.println(c);
        // System.out.println(g1.GenMethod("Helloo "));
        System.out.println(g1.GenMethod(22));
        // g1.GenMethod(input);


    }
}

class GenericClass <T> {

    // int id;
    T id;

    void setId(T id)
    {
        this.id = id;
    }

    <G extends Number> G GenMethod(G input)
    {
        // System.out.println(input);
        return input;
    }

    T getID()
    {
        return id;
    }

}
interface genericop<T,E>{
    T getvalue();
    E getData();
}
abstract class genericoperation<T,E> implements genericop<T,E>{
    T value;
    E data;
    genericoperation(T value,E data){
        this.value = value;
        this.data = data;
    }
}