public class DiscountCalculationUsingVarargs_Method {
    static double Discount(double ...A){
        int amount=0;
        for(int i=0; i<A.length; i++){
            amount +=A[i];
        }
        if(amount<500)
            return amount*0.10;
        else if(amount>=500 && amount<1000)
            return amount*0.15;
        else
            return amount*0.20;
    }
    public static void main(String[] args){
        System.out.print(Discount()+" ");
        System.out.print(Discount(10)+" ");
        System.out.print(Discount(10,20,30)+" ");
        System.out.print(Discount(10,20,30,40,50)+" ");
    }
}
