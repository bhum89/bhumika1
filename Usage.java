import java.util.Scanner;
class Boolean{
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter any two number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(a+"\n"+b);
    boolean a1=true;
    boolean b1=false;
    if(a>b)
    {
       System.out.println(a1);
    }
    else
    {
       System.out.println(b1);
    }
  }
}
