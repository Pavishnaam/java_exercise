import java.util.*;

public class studentlist
{
    int id; int age;
    String name; String state; String language;
    public studentlist(int id, int age, String name,  String state, String language)
    {
        this.id = id;
        this.age = age;
        this.name=name;
        this.state=state;
        this.language=language;
    }
    public static void main(String[] args)
    {
        List<studentlist> s = new ArrayList<studentlist>();
        studentlist s1 = new studentlist(1001,19,"bella","tamilnadu","tamil");
        studentlist s2 = new studentlist(1002,16,"ariel","kerala","tamil");
        studentlist s3 = new studentlist(1003,14,"elsa","andhra","hindi");
        studentlist s4 = new studentlist(1004,17,"mulan","tamilnadu","kannadam");
        studentlist s5 = new studentlist(1005,18,"aurora","mumbai","tamil");
        studentlist s6 = new studentlist(1006,20,"cindrella","tamilnadu","hindi");
        studentlist s7 = new studentlist(1007,13,"moana","hyderabad","telugu");
        
        s.add(s1);s.add(s2);s.add(s3);s.add(s4);s.add(s5);s.add(s6);s.add(s7);
        
        
        System.out.println("list of students whose lanuage is hindi and age less than 15");
        for(studentlist stud:s)
            if((stud.language).equals("hindi") && stud.age<15){
                System.out.println(stud.name +"  "+stud.id);
            }
        System.out.println("list of students whose lanuage is not tamil and native as tamilnadu");
        for(studentlist stud:s)
            if(!(stud.language).equals("tamil") && (stud.state).equals("tamilnadu")){
                System.out.println(stud.name +"  "+stud.id);
            }
        System.out.println("list of students whose lanuage is telugu and native as hyderabad");
        for(studentlist stud:s)
            if((stud.language).equals("telugu") && (stud.state).equals("hyderabad")){
                System.out.println(stud.name +"  "+stud.id);
            }
    }
}
