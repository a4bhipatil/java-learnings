interface Member{
    void callback();
}
class Store{
    Member men[]=new Member[100];
    int count=0;

    void register(Member m){
        men[count++]=m;
    }
    void invitesale(){
        for(int i=0; i<count; i++)
            men[i].callback();
    }
}
class Customer implements Member{
    String name;
    Customer(String n){
        name=n;
    }
    public void callback(){
        System.out.println("ok i will visit,"+name);
    }
}
public class InterfaceExample1 {
    public static void main(String[] args){
        Store s=new Store();
        Customer c1=new Customer("john");
        Customer c2=new Customer("smith");
        s.register(c1);
        s.register(c2);
        s.invitesale();
    }
}
