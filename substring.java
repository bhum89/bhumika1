import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        System.out.println("Enter name");
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        System.out.println("Enter enroll");
        String  s1=sc.nextLine();
        String  s2="22";
        String s3=s1.substring(9,12);
        System.out.println(s+s3+s2+"@acroplois.in");
    }
}
