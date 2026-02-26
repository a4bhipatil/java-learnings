import java.util.Date;

class Account{
    private String accno;
    private String name;
    private String address;
    private String phno;
    private Date dob;
    protected double ballence;


    public String getAccno(){
        return accno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public Date getDob() {
        return dob;
    }

    public double getBallence() {
        return ballence;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhno(String phno){
        this.phno=phno;
    }
    public void setBallence(double ballence){
        if(ballence>=0)
            this.ballence=ballence;
        else
            System.out.println("Zero ballence");
    }
    public Account(String accno,String name,String address,String phno,Date dob,double ballence){
        this.accno=accno;
        this.name=name;
        this.address=address;
        this.phno=phno;
        this.dob=dob;
        this.ballence=ballence;
    }
}
class Savingaccount extends Account{
    public Savingaccount(String accno, String name, String address, String phno, Date dob, double ballence) {
        super(accno, name, address, phno, dob, ballence);
    }

    public void deposit(long amt){
        ballence +=amt;
    }
    public void withdraw(long amt){
        ballence-=amt;
    }
}
class LoanAccount extends Account{
    public LoanAccount(String accno, String name, String address, String phno, Date dob, double ballence) {
        super(accno, name, address, phno, dob, ballence);
    }

    public void payemi(long amt){
        ballence-=amt;
    }
    public void repay(long amt){
        if(ballence==amt)
            ballence=0;
    }
}
public class InheritenceForBank {
    public static void main(String[] args){

    }
}
