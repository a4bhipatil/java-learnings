public class Stringpractice3 {
    public static void main(String[] args){
//        String str="abcdef";
//        System.out.println(str.matches("[a-z]*"));
//        System.out.println(str.matches("[a-z]+"));
//        System.out.println(str.matches("[abc]*"));
        String str="programmer@gmail.com";
        int i=str.indexOf("@");
        String username=str.substring(0,i);
        System.out.println("Username:"+username);
        String domain=str.substring(i+1,str.length());
        System.out.println("Domain:"+domain);
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
}
