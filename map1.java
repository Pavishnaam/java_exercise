
import java.util.*;
public class map1{
    public static void main(String[] args)
    {
        Map<Integer, String> m = new HashMap<>();
        m.put(1001,"Hema");
        m.put(1002,"Priya");
        m.put(1003,"Neel");
        m.put(1004,"Ram");
        m.putIfAbsent(1005,"Ram1");
        m.put(1003,"Neel1");
        // m.replace(1003,"Neel2");
        m.replace(1003,"Neel2","Neel");
        m.entrySet().forEach((d) -> 
        {
        System.out.println("Key : " +d.getKey()+" Value : "+d.getValue());
        });
        m.put(1003, "Hana");
        m.remove(1004);
        System.out.println(m.containsValue("Anu"));
        System.out.println(m.containsKey(1003));
        System.out.println(m);
    }
}



