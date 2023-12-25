import java.util.Scanner;
public class A{
public static void main(String[]args){
int n;
  int f=1;
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter a number");
  n=sc.nextInt();
  for(int i=n;i>=1;i--)
    {
       f=f*i;
    }
  System.out.println("Factorial is "+f);
}
}
