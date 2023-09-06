import java.util.Scanner;
class Swap{
public static void main(String[]args){
  Scanner sc new Scanner(System.in);
  System.out.println("Enter any two number");
  int a =sc.nextInt();
  int b=sc.nextInt();
  int temp;
  System.out.println("a="+a+"\nb="+b);
  temp=a;
  a=b;
  b=temp;
  System.out.println("a="+a+"\nb="+b);
}
}
  
