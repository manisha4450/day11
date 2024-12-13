import java.util.*;
class arr{
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,3,7,8,3,9};
        Set<Integer>a=new HashSet<>();
        Set<Integer>b=new HashSet<>();
        for(int s:arr1)
        a.add(s);
        for(int s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<Integer>u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);
    }
}