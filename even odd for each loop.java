//WAP to count the even number and odd number present in array
import java.util.Arrays;
public class Ex{
public static void main(String []args){
    int a[]={1,2,3,4,5,6,7,8,9,10};
    int count =0;
    int countodd=0;
    for( int i: a)
    {
        if(i%2==0)
        {
            count++;
        }
        else
        {
            countodd++;
        }
    }
    System.out.println("Even no.=" +count);
    System.out.println("Odd no.="+countodd);
}
}
