public class GCDof2Numbers_Method {
    static int GCD(int m , int n){
        while (m!=n){
            if (m < n)
                n = n - m;
            else
                m = m - n;
        }
        return m;
    }
    public static void main(String[] args){
        int a=35,b=56;
        System.out.println(GCD(a,b));
    }
}
