import java.util.*;



public class setgrocery {



    public static void main(String[] arg)
    {
        Set<String> u_ten = new HashSet<String>();
        Set<String> u_twe = new HashSet<String>();
        Set<String> f_to_s = new HashSet<String>();
        u_ten.add("a");u_ten.add("b");u_ten.add("c");u_ten.add("d");u_ten.add("e");
        u_twe.add("d");u_twe.add("f");u_twe.add("g");u_twe.add("h");u_twe.add("e");
        f_to_s.add("h");f_to_s.add("i");f_to_s.add("j");f_to_s.add("c");f_to_s.add("e");

  
        System.out.println("common in all three");
        Set<String> intersect=new HashSet<String>(u_ten);
        intersect.retainAll(u_twe);
        intersect.retainAll(f_to_s);
        System.out.println(intersect);

        System.out.println("unique in under 10 category");
        Set<String> diff1 = new HashSet<String>(u_ten);
        diff1.removeAll(u_twe);
        diff1.removeAll(f_to_s);
        System.out.println(diff1);
        
        System.out.println("unique in under 20 category");
        Set<String> diff2 = new HashSet<String>(u_twe);
        diff2.removeAll(u_ten);
        diff2.removeAll(f_to_s);
        System.out.println(diff2);
        
        System.out.println("unique in 50-60 category");
        Set<String> diff3 = new HashSet<String>(f_to_s);
        diff3.removeAll(u_twe);
        diff3.removeAll(u_ten);
        System.out.println(diff3);

    }
}

