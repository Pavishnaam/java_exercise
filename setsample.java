

import java.util.*;
public class setsample {
    public static void main(String[] args)
    {
        Set<String> Set = new HashSet<String>();
        Set.add("Apple");
        Set.add("Orange");
        Set.add("Apple");
        Set.add("Grapes");
        Set.add("Berries");
        System.out.println(Set);
        Set.remove("Orange");
        for (String s:Set)
        System.out.println(s);
        Iterator<String> iter = Set.iterator();
        while (iter.hasNext())
        System.out.println(iter.next());
    }
}


