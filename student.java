import java.util.*;
import java.io.*;

public class student{
    String name;String course;
    public student(String name,String course){
        this.name=name;
        this.course = course;
    }
    public static void main(String[] args){
        List<student> l = new ArrayList<student>();
        List<String> bce = new ArrayList<String>();
        List<String> bee = new ArrayList<String>();
        List<String> mis = new ArrayList<String>();
        student std1 = new student("pavi","bce");
        student std2 = new student("varun","bee");
        student std3 = new student("ajay","bee");
        student std4 = new student("boomi","mis");
        student std5 = new student("jani","bce");
        student std6 = new student("ram","mis");
        
        
        l.add(std1);l.add(std2);l.add(std3);l.add(std4);l.add(std5);l.add(std6);
        
        for(student k:l)
            if(k.course == "bce"){
                bce.add(k.name);
            }
        for(student k:l)
            if(k.course == "bee"){
                bee.add(k.name);
            }
        for(student k:l)
            if(k.course == "mis"){
                mis.add(k.name);
            }
        System.out.println("IN BCE");
       for (String a:bce)
           System.out.println(a);
       System.out.println("IN BEE");
       for (String b:bee)
           System.out.println(b);
       System.out.println("IN BCE");
       for (String c:mis)
           System.out.println(c);
       
            }
        
    
}
