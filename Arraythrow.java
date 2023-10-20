import java.util.Scanner;
public class TestThrows{
    public static void  method1(int a[])throws ArithmeticException{
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
    }
        
         public static void main(String []args){
             int a[];
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter size");
             int n=sc.nextInt();
             a=new int[n];
        try{
            method1(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nNumber cannot be print"+e);
        }
        System.out.println("\nRest of code");
        }
}
