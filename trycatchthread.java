class Threadcount extends Thread{
    Threadcount(String s){
        super(s);
        System.out.println("New thread "+this);
        start();
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("New thread created"+this);
                Thread.sleep(1500);
            }
        }
        catch(Exception e){
            System.out.println("Currently executing");
        }
        System.out.println("Currently thread run");
    }
    public static void main(String[]args){
        Threadcount t1=new Threadcount("hello");
        
    }
}
