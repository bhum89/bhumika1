

public class Ex{
public static void main(String []args){
    int a[]=new int[]{1,2,3,4,5};
    int sum=0;
    double avg=0;
    for(int i:a){
        sum=sum+i;
    }
    System.out.println("Sum="+sum);
     avg=(double)sum/a.length;
    System.out.println(avg);
}
}
