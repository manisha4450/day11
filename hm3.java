import java.util.*;
public class hm3{
    public static void main(String[] args){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNO","01");
        a.put("SNAME","Muraja");
        a.put("city","chennai");
        System.out.println(a);
        a.put("SNO","90");
        System.out.println(a);
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}