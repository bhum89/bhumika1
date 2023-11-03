class A{
    public static void fun(int n1,int n2,int n){
        if(n==0){
            for(int i=n1;i<n2;i++){
            if(i%2==0){
                System.out.println("Even no."+i);
            }
            }
        }
            else
{
    for(int i=n1;i<n2;i++){
        if(i%2!=0){
            System.out.println("Even no."+i);
        }
    }
}
        }
    }

class B extends Thread{
    public void run()
    {
        A.fun(1,10,0);
    }
}
class C extends Thread{
    public void run()
    {
        A.fun(1,10,1);
    }
    }
  public   class D{
    public static void main(String []args){
        B ob=new B();
        ob.start();
        C obj = new C();
        obj.start();
    }
}
