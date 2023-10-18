import java.util.Scanner;
class Main{
    public static void main(String[]args){
        try{
            int n;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter value");
            n=sc.nextInt();
            int divideByzero=5/n;
            System.out.println("Rest of code in try block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException =>"+e.getMessage());
        }
    }
}
