import java.util.Arrays;

class Subjects{
    private String subid;
    private String name;
    private int maxmarks;
    private int marksobtain;

    public String getSubid(){
        return subid;
    }
    public String getName(){
        return name;
    }
    public int getMaxmarks(){
        return maxmarks;
    }
    public int getMarksobtain(){
        return marksobtain;
    }

    public void setMaxmarks(int maxmarks){
        this.maxmarks=maxmarks;
    }
    public void setMarksobtain(int marksobtain){
        this.marksobtain=marksobtain;
    }

    boolean isQualified(int m){
        return m>=marksobtain/10*4;
    }
    public Subjects(String subid,String name,int maxmarks){
        this.subid=subid;
        this.name=name;
        setMaxmarks(maxmarks);
    }
    public String toString(){
        return "Subject ID: "+subid+"\nsubject name: "+name+"\nsubject maxmarks: "+maxmarks+"\n----------------------";
    }

}
class student1{
    private int rollno;
    private String name;
    private String dept;
    private String subjects;

    public int getRollno() {
        return rollno;
    }
    public String getName(){
        return name;
    }

    public String getDept() {
        return dept;
    }
    public String getSubjects(){
        return subjects;
    }
    public void setSubjects(String subjects){
        this.subjects=subjects;
    }
    public student1(int rollno,String name,String dept,String subjects){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        setSubjects(subjects);
    }
    public String toString(){
        return "Student rollno "+rollno+"\nstudent name: "+name+"\nstudent dept: "+dept+"\nstudent subjects: "+subjects+"\n---------------------";
    }
}
public class StudentChallengeOnPropertiesAndCunstructor1 {
    public static void main(String[] args){
        Subjects sub[]=new Subjects[3];
        sub[0]=new Subjects("s101","java",200);
        sub[1]=new Subjects("s102","python",200);
        sub[2]=new Subjects("s103","DSA",200);

        for(Subjects s:sub)
            System.out.println(s);

        student1 s1[] =new student1[3];
        s1[0]=new student1(88,"abhi","cse","4");
        s1[1]=new student1(73,"sushma","cse","4");
        s1[2]=new student1(88,"abhilash","E&C","5");

        for(student1 x:s1)
            System.out.println(x);
    }
}
