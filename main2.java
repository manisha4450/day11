import java.util.*;
class main2{
    public static void main(String[] args){
        LinkedHashSet<String>a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
       Interator itr=a.Iterator();
       while(itr.hasNext())
       {
        System.out.println(itr.next()+" ");
       }
    }
}