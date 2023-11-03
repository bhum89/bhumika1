class A{
    static int amt=50000;
    static String Ac="4567839";
    public static void withdraw(int amt1){
        if(amt1<50000){
             int curramt = 50000-amt1;     
             System.out.println("Amount remained"+curramt);
        }
    }
    public static void  deposit(int amt1){
        if(amt1<50000){
             int curramt = 50000+amt1;     
             System.out.println("Amount remained"+curramt);
        }
    }
    }

class B extends Thread{
    public void run()
    {
        A.withdraw(2000);
    }
}
class C extends Thread{
    public void run()
    {
        A.deposit(4000);
    }
    }
  public   class Main{
    public static void main(String []args){
        B ob=new B();
        ob.start();
        C obj = new C();
        obj.start();
    }
}
