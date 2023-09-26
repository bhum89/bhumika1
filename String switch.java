import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        System.out.println("enter String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter choice -0 for lowercase,1 for uppercase");
        int i=sc.nextInt();
        switch(i) {
            case '0': String s2=s.toLowerCase();
            System.out.println(s2);
            break;
            case '1':String s1=s.toUpperCase();
            System.out.println(s1);
            break;
            default:System.out.println("Wrong number ");
            break;
        }
    }
}
