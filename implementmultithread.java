//inheriting thread class
public class Main implements Runnable{
    public static void main(String[ ] args){
        Main thread1 = new Main();
         Thread t1 = new Thread(thread1);
        t1.start();
        Main thread2 = new Main();
         Thread t2 = new Thread(thread2);
        t2.start();
        System.out.println("This code is outside\n");
    }
    public void run(){
        System.out.println("This code is inside\n");
    }
}
