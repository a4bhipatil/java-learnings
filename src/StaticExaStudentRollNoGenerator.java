import java.util.*;
class Student{
    private String rollno;
    private static int count=1;
    private String generator(){
        Date d=new Date();
        String m="Univ"+"-"+(d.getYear()+1900)+"-"+count;
        count++;
        return m;
    }
    public Student() {
        rollno=generator();
    }
    public String getRollno(){
        return rollno;
    }
}
public class StaticExaStudentRollNoGenerator {
    static public void main(String[] args){
        Student s=new Student();
        Student s1=new Student();
        Student s2=new Student();

        System.out.println(s.getRollno());
        System.out.println(s1.getRollno());
        System.out.println(s2.getRollno());

    }
}
