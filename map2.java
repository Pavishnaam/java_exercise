
import java.util.*;
public class map2 {
    public static void main(String[] args) throws Exception
    {
        Map<Integer, String> m = new HashMap<>();
        Map<Integer, String> m1 = new HashMap<>();
        Map<Integer, String> m2 = new HashMap<>();
        m.put(1001,"Hema");
        m.put(1002,"Priya");
        m.put(1003,"Anu");
        m.put(1004,"Upasna");
        String s;
        System.out.println(m);
        // for (Map.Entry<Integer, String> d : m.entrySet())
        m.entrySet().forEach((d) ->
        {
        // s= d.getValue();
        if (d.getValue().charAt(0) == 'A' ||d.getValue().charAt(0) == 'U')
        {
        m1.put(d.getKey(),d.getValue());
        // m.remove(d.getKey());
        }
        else
        m2.put(d.getKey(),d.getValue());
        // System.out.println("Key : " +d.getKey()+"/t"+"Value : "+d.getValue());
        });
        System.out.println("Records in m2 : ");
        System.out.println(m2);
        System.out.println("Records in m1 : ");
        m1.entrySet().forEach((d) ->
        {
        System.out.println("Key : " +d.getKey()+"   "+"Value : "+d.getValue());
        });
    }
}

