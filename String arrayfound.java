//WAP to crate a String array and search array
import java.util.*;
public class Ex{
public static void main(String []args){
    String a[]={"Dog","Cat","Man"};
    Scanner sc = new Scanner (System.in);
    String str=sc.next();
    for(int i=0;i<a.length;i++)
    {
    if(a[i] .equals(str)){
        System.out.println("Found");
        break;
    }
    else
    {
        System.out.println("Not Found");
        break;
    }
   }
}
}
