//write a program to declare integer array
import java.util.*;
public class Ex{
public static void main(String []args){
    int arr[]=new int [10];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("Enter no.");
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
}
}
