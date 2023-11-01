//interface thread class
public class Main implements Runnable{
    public static void main(String[ ] args){
        Main thread = new Main();
        
        Thread t = new Thread(thread);
        t.start();
        System.out.println("This code is outside\n");
    }
    public void run(){
        System.out.println("This code is inside\n");
    }
}
