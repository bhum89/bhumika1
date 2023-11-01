public class A implements Runnable{
    public void run(){
        try{
            System.out.println("Java");
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Currentlt executing");
            
        }
       
    }
    public static void main(String[]args){
        for(int i=0;i<10;i++){
            Thread t1 = new Thread(new A());
            t1.start();
        }
    }
}
