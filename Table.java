import java.util.Scanner;
public class A{
public static void main(String[]args){
int n;
  Scanner sc =new Scanner (System.in);
  System.out.println("Enter a number");
  n=sc.nextInt();
  for(int i=1;i<=10;i++)
    {
       System.out.println(n+"*"+i+"="+n*i);
    }
}
}
