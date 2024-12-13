import java.util.*;
public class hm2{
    public static void main(String[] args){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNO","01");
        a.put("SNAME","Muraja");
        System.out.println(a);
        if(a.containsKey("SName"))
        {
            String d=a.get("SName");
            System.out.println(d);
        }
    }
}