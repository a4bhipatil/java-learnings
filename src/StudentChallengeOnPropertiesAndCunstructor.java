class product{
    private String itemno;
    private String name;
    private double price;
    private int qty;


    public String getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double P){
        this.price=P;
    }
    public void setQty(int q){
        this.qty=q;
    }

    public product(String Itm){
        itemno=Itm;
    }
    public product(String Itm,String name){
        this.name=name;
    }
    public product(String Itm,String name,double P,int q){
        itemno=Itm;
        this.name=name;
        setPrice(P);
        setQty(q);
    }

}

class customer{
    private int custid;
    private String name;
    private String address;
    private String phno;

    public int getCustid(){
        return custid;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhno(){
        return phno;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhno(String no){
        phno=no;
    }

    public customer(int id,String address){
        this.custid=id;
        this.address=address;
    }
    public customer(int id,String name,String address,String no){
        this.custid=id;
        this.address=address;
        setAddress(address);
        setPhno(no);
    }

}
public class StudentChallengeOnPropertiesAndCunstructor {
    public static void main(String[] args){

    }
}
