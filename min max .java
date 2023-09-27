//WAP to find the minimum and maximum array in minimum code
import java.util.Arrays;
public class Ex{
public static void main(String []args){
    int a[]={10,45,29,56,7};
    System.out.println(Arrays.toString(a));
    Arrays.sort ( a);
     System.out.println(Arrays.toString(a));
     System.out.println("Min="+a[0]);
     System.out.println("Max= "+a[a.length-1]);
}
}
