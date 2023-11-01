//inheriting thread class
public class Main extends Thread{
    public static void main(String[ ] args){
        Main thread1 = new Main();
        thread1.start();
        Main thread2 = new Main();
        thread2.start();
        System.out.println("This code is outside\n");
    }
    public void run(){
        System.out.println("This code is inside\n");
    }
}
