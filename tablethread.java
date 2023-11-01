import java .util.Scanner;
public class Main extends Thread{
    public static void main(String[]args){
        Main t1=new Main();
        t1.start();
        Main t2=new Main();
        t2.start();
    }
    public void run(){
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
         
        for(int i=1;i<=10;i++)
        {
            System.out.println(m+"*"+i+"="+m*i);
        }
    }
}
