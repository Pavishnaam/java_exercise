import java.util.*;
import java.io.*;

public class joblist
{
    String name;int age;String gender;int experience;String ug;String skill1;String skill2;String skill3;
    public joblist(String name,int age,String gender,int experience,String ug,String skill1,String skill2,String skill3)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.experience=experience;
        this.ug=ug;
        this.skill1=skill1;
        this.skill2=skill2;
        this.skill3=skill3;
    }
    public static void main(String[] args){
        List<joblist> l = new ArrayList<joblist>();
        joblist std1 = new joblist("pavi",20,"female",2,"engineering","python","c++","java");
        joblist std2 = new joblist("varun",28,"male",8,"engineering","html","c","js");
        joblist std3 = new joblist("ajay",24,"male",5,"engineering","c","react","r programming");

        l.add(std1);l.add(std2);l.add(std3);
        System.out.println("Enter the age limit......");
        Scanner sc = new Scanner(System.in);
        int l_age = sc.nextInt();
        System.out.println("Enter the year of experience......");
        int yoe = sc.nextInt();
        System.out.println("Enter the skill needed.....");
        String skill = sc.next();
        System.out.println("Suitable candicate for the job...........");
        for(joblist k:l){
            if(k.age<=l_age && k.experience>=yoe &&(k.skill1.equals(skill) || k.skill2.equals(skill) || k.skill3.equals(skill))){
                System.out.println(k.name);
            
            }
        }
           
        }
    
   }
  
 
