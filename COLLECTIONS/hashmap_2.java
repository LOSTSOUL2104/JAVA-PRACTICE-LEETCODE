package COLLECTIONS;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class hashmap_2 {
    public static void main(String[] args) {
//        Map<String, Integer> hash = new HashMap<String,Integer> ();
//        hash.put ("hello", 1);
//        hash.put ("worrr",2);
//        hash.put("lol",3);
//        System.out.println (hash);
//        hash.remove (2);
//        System.out.println (hash);

    }
    public static void hashdemo()
    {

    }

}
class mapusingHash
{
    private Entity[]entities;
    public mapusingHash()
    {
        entities = new Entity[100];

    }
    public void put(String key,String value)
    {
        int hash = Math.abs (key.hashCode()%entities.length);
        entities[hash] = new Entity (key,value);
    }
    public String get(String key)
    {
        int hash = Math.abs (key.hashCode ()%entities.length);
        if (entities[hash] != null && entities[hash].key.equals (key))
        {
//            return entities.[hash]value;
        }
        return null;
    }
    private class Entity{
        String key;
        String value;
        public Entity(String key,String value)
        {
            this.key = key;
            this.value = value;
        }
    }
}