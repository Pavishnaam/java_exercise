
import java.util.*;
import java.io.*;


public class complist{
    String name;int reg;
    public complist(String name,int reg){
        this.name=name;
        this.reg=reg;
    }
    public static void main(String args[ ]){
        //student data containing reg_no and name
       List<complist> c = new ArrayList<complist>(); 
       complist std1 = new complist("pavi",1001);complist std8 = new complist("boomi",1008);complist std15 = new complist("abi",1015);
       complist std2 = new complist("ram",1002);complist std9 = new complist("varshi",1009);complist std16 = new complist("dhanu",1016);
       complist std3 = new complist("ravi",1003);complist std10 = new complist("selvi",1010);complist std17 = new complist("suresh",1017);complist std4 = new complist("raja",1004);
       complist std5 = new complist("anna",1005);complist std11 = new complist("manoj",1011);complist std12 = new complist("bala",1012);complist std18 = new complist("priya",1018);
       complist std6 = new complist("mulan",1006);complist std13 = new complist("yeswanth",1013);complist std19 = new complist("gokul",1019);
       complist std7 = new complist("janu",1007);complist std14 = new complist("mani",1014);complist std20 = new complist("gokul",1020);
       
       c.add(std1);c.add(std2);c.add(std3);c.add(std4);c.add(std5);c.add(std6);c.add(std7);c.add(std8);c.add(std9);c.add(std10);c.add(std11);c.add(std12);
       c.add(std13);c.add(std14);c.add(std15);c.add(std16);c.add(std17);c.add(std18);c.add(std19);c.add(std20);
       
       // dancelist
       List<Integer> dancelist = new ArrayList<Integer>();
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter no.of.students value to be entered in dance : ");
//       int n = sc.nextInt();
//       for(int i=0;i<n;i++)
//       {
//           int no = sc.nextInt();
//           dancelist.add(no);
//       }
       List<Integer> sportslist = new ArrayList<Integer>();
//       System.out.println("enter no.of.students value to be entered in sports : ");
//       int n1 = sc.nextInt();
//       for(int i=0;i<n1;i++)
//       {
//           int no = sc.nextInt();
//           sportslist.add(no);
//       }
       List<Integer> musiclist = new ArrayList<Integer>();
//       System.out.println("enter no.of.students value to be entered in music : ");
//       int n2 = sc.nextInt();
//       for(int i=0;i<n2;i++)
//       {
//           int no = sc.nextInt();
//           musiclist.add(no);
//       }
       
       dancelist.add(1001);dancelist.add(1002);dancelist.add(1003);dancelist.add(1004);dancelist.add(1005);
       sportslist.add(1006);sportslist.add(1007);sportslist.add(1008);sportslist.add(1003);sportslist.add(1005);
       musiclist.add(1009);musiclist.add(1010);musiclist.add(1011);musiclist.add(1007);musiclist.add(1005);
       
       
       System.out.println("students registered for any one of the competition");
       for(complist k:c){
           if(dancelist.contains(k.reg) || musiclist.contains(k.reg) || sportslist.contains(k.reg)){
               System.out.println(k.name + "  " + k.reg);
           }
       }
       System.out.println("students registered for all the competition");
       for(complist k:c){
           if(dancelist.contains(k.reg) && musiclist.contains(k.reg) && sportslist.contains(k.reg)){
               System.out.println(k.name + "  " + k.reg);
           }
       }
       System.out.println("students not registered for any of the competition");
       for(complist k:c){
           if(!(dancelist.contains(k.reg) || musiclist.contains(k.reg) || sportslist.contains(k.reg))){
               System.out.println(k.name + "  " + k.reg);
           }
       }
    }
}