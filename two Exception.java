import java.util.Scanner;
public class Test{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
            int n=Integer.parseInt(sc.nextLine());
            if(99%n==0){
                System.out.println(n+"is a factor");
            }
        }
            // catch(ArithmeticException ex){
            //     System.out.println("Arithmetic"+ex);
            // }
            catch(NumberFormatException | ArithmeticException ex){
                {
                    System.out.println("NumberFormatException"+ex);
                }
            }
        }
    }
