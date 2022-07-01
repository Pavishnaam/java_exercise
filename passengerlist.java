import java.util.*;

public class passengerlist{
    String p_name,s_location,d_location,date,t_name;
    int pnr,age,t_no;
    public passengerlist(int pnr,String p_name,String s_location,String d_location,String date,int age,int t_no,String t_name){
        this.pnr=pnr;
        this.p_name=p_name;
        this.s_location=s_location;
        this.d_location=d_location;
        this.date=date;
        this.age=age;
        this.t_no=t_no;
        this.t_name=t_name;
    }
    public static void main(String[] args){
        List<passengerlist> pass = new ArrayList<passengerlist>();
        passengerlist p1 = new passengerlist(123,"elsa","chennai","delhi","jan_12",19,1,"mater");
        passengerlist p2 = new passengerlist(456,"ariel","chennai","mumbai","jan_12",22,2,"mcqueen");
        passengerlist p3 = new passengerlist(789,"bella","kovai","mumbai","jan_01",22,2,"mcqueen");
        passengerlist p4 = new passengerlist(321,"anna","kovai","delhi","jan_01",19,1,"mater");
        
        pass.add(p1);pass.add(p2);pass.add(p3);pass.add(p4);
        
         ArrayList<String> hset = new ArrayList<String>();
        for(passengerlist k:pass)
            hset.add(k.t_name);  
        Set<String> t1 = new HashSet<String>(hset);
        for(String s:t1){
            System.out.println("Persons travelling on "+ s+ " train");
            for(passengerlist k:pass){
                if(k.t_name==s){
                    System.out.println(k.p_name);
                }
            }
        }
        
        
        ArrayList<String> hset1 = new ArrayList<String>();
        for(passengerlist k1:pass)
            hset1.add(k1.date);  
        Set<String> d1 = new HashSet<String>(hset1);
        for(String s1:d1){
            System.out.println("Persons travelling on "+ s1);
            for(passengerlist k1:pass){
                if(k1.date==s1){
                    System.out.println(k1.p_name);
                }
            }
        }
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to modify source location ");
        System.out.println("enter 2 to modify destination location ");
        System.out.println("enter 3 to modify passenger name ");
        System.out.println("enter 4 to modify train name ");
        System.out.println("enter 5 to modify date ");
        System.out.println("enter 6 to modify age ");
        int select = sc.nextInt();
        System.out.println("enter the pnr value to modify details");
        int mod = sc.nextInt();
        for(passengerlist p :pass)
        {
            if(select==1 && p.pnr==mod)
            {
                System.out.println("new source location");
                String text = sc.next();
                p.s_location = text;
                System.out.println("successfully updated");
            }
            if(select==2 && p.pnr==mod)
            {
                System.out.println("new destination location");
                String text = sc.next();
                p.d_location = text;
                System.out.println("successfully updated");
            }
            if(select==3 && p.pnr==mod)
            {
                System.out.println("new passenger name");
                String text = sc.next();
                p.p_name = text;
                System.out.println("successfully updated");
            }
            if(select==4 && p.pnr==mod)
            {
                System.out.println("new train name");
                String text = sc.next();
                p.t_name = text;
                System.out.println("successfully updated");
            }
            if(select==5 && p.pnr==mod)
            {
                System.out.println("new date");
                String text = sc.next();
                p.date = text;
                System.out.println("successfully updated");
            }
            if(select==6 && p.pnr==mod)
            {
                System.out.println("new age");
                int text = sc.nextInt();
                p.age = text;
                System.out.println("successfully updated");
            }
            
        }
        
        
    }
}
