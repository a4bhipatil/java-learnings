class student{
    public int rollno;
    public String Name;
    public String course;
    public int m1,m2,m3,m4;
    int total(){
        return m1+m2+m3;
    }
    float average(){
        return (float) total()/4;
    }
    char grad(){
        if(average()>=60) return 'A';
        else
            return 'B';
    }
    public String details(){
        return "Roll num "+rollno+"\n"+"Student Name "+Name+"\n"+"Student Course "+course+"\n"+"Student Marks "+m1 +m2+m3+m4+"\n"+"Student total marks "+total()+"\n"+"Student average marks "+average()+"\n"+"Student grade "+grad();
    }
}
public class StudentData {
    public static void main(String[] args){
        student s1=new student();
        s1.rollno= 688;
        s1.Name="Abhilash";
        s1.course="Computer science and engineering";
        s1.m1=17; s1.m2=17; s1.m3=12; s1.m4=14;
        System.out.println(s1.details());
    }
}
