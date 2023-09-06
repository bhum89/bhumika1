import java.util.Scanner;
public class A{
  public static void main(String[]args){
  int n;
    int rev=0;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    while(n>0){
      int a=n%10;
    rev=rev*10+a;
    n=n/10;
  }
    Sysetem.out.println(rev);
  }
}
