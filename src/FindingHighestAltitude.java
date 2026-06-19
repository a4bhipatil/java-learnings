import java.util.Arrays;

class leet{
    public int largestalttitude(int[] gain){
        int[] altitude=new int[gain.length+1];
        altitude[0]=0;
        for(int i=0; i<gain.length; i++){
            altitude[i+1]=altitude[i]+gain[i];
        }
        Arrays.sort(altitude);
        int[] temp=new int[altitude.length];
        for(int i=0; i<altitude.length; i++){
            temp[i]=altitude[altitude.length-1-i];
        }
        return temp[0];
    }
}
public class FindingHighestAltitude {
    public static void main(String[] args){
        int[] gain={-5,1,5,0,-7};
        leet lt=new leet();
        System.out.println(lt.largestalttitude(gain));
    }
}
