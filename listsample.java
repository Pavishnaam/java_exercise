import java.util.*;
import java.io.*;

public class listsample{
    String name;int reg,age;
    public listsample(String name,int reg,int age){
        this.name=name;
        this.reg=reg;
        this.age=age;
    }
    public static void main(String[] args){
        List<listsample> l = new ArrayList<listsample>();
        listsample std1 = new listsample("pavi",1001,19);
        listsample std2 = new listsample("varun",1002,21);
        listsample std3 = new listsample("ajay",1003,19);
        listsample std4 = new listsample("boomi",1004,22);
        listsample std5 = new listsample("jani",1005,19);
        listsample std6 = new listsample("ram",1006,19);
        listsample std7 = new listsample("ravi",1007,24);
        listsample std8 = new listsample("suresh",1008,19);
        listsample std9 = new listsample("elsa",1009,23);
        
        l.add(std1);l.add(std2);l.add(std3);l.add(std4);l.add(std5);l.add(std6);l.add(std7);l.add(std8);l.add(std9);
        
        System.out.println("ABOVE 20......");
        for(listsample k:l)
            if(k.age>20){
                System.out.println(k.reg);
            }
        System.out.println("BELOW 20......");
        for(listsample k:l)
            if(k.age<20){
                System.out.println(k.reg);
            }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name :");
        String search = sc.nextLine(); // enter name
        
        for(listsample k:l)
            if((k.name).equals(search)){
                System.out.println(k.reg);
                System.out.println(k.age);
            } 
        ArrayList<Integer> hset = new ArrayList<Integer>();
        for(listsample k:l)
            hset.add(k.age);  
        Set<Integer> age1 = new HashSet<Integer>(hset);
        for(Integer s:age1){
            System.out.println("Persons of age "+ s);
            for(listsample k:l){
                if(k.age==s){
                    System.out.println(k.name);
                }
            }
        }
    }
}
