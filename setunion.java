import java.util.*;



public class setunion {



    public static void main(String[] arg)
    {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        s1.add(11);
        s1.add(12);
        s1.add(13);
        s1.add(14);
        s2.add(14);
        s2.add(15);
        s2.add(16);

        Set<Integer> union=new HashSet<Integer>(s1);
        union.addAll(s2);
        System.out.println(union);

        Set<Integer> intersect=new HashSet<Integer>(s1);
        intersect.retainAll(s2);
        System.out.println(intersect);

        Set<Integer> diff = new HashSet<Integer>(s1);
        diff.removeAll(s2);
        System.out.println(diff);

    }
}
