import java.util.*;
import java.io.*;

public class cricket
{
    String name;int runs;int balls;int boundaries;int sixes;
    public cricket(String name,int runs,int balls,int boundaries,int sixes)
    {
        this.name=name;
        this.runs=runs;
        this.balls=balls;
        this.boundaries=boundaries;
        this.sixes=sixes;
    }
    public static void main(String[] args){
        List<cricket> l = new ArrayList<cricket>();
        cricket std1 = new cricket("pavi",100,10,12,4);
        cricket std2 = new cricket("varun",200,15,9,4);
        cricket std3 = new cricket("ajay",150,12,8,5);
        cricket std4 = new cricket("boomi",132,11,3,11);
        
        
        l.add(std1);l.add(std2);l.add(std3);l.add(std4);
        int max_bound=0;String max_bound_player="";
        System.out.println("Maximum boundaries scored by......");
        for(cricket c:l){
            if(c.boundaries>max_bound)
                max_bound=c.boundaries;
                max_bound_player=c.name;
        }
        System.out.println(max_bound_player);
       System.out.println("....................................................................");
        for(cricket c:l){
           System.out.println(c.name);
           float strike=c.runs/c.balls;
           System.out.println("strike rate    "+strike);
           int bound_run=(c.boundaries)*4;
           int six_run=(c.sixes)*6;
           int p_b=(bound_run*100)/c.runs;
           int p_s=(six_run*100)/c.runs;
           System.out.println("Percentage of runs scored through boundaries   "+p_b);
           System.out.println("Percentage of runs scored through sixes   "+p_s);
           
        }
        }
   }
 
