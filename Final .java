 final  class FinalDemo{
    public   void display(){
        System.out.println("This is final method");
    }
}
 public class Main extends FinalDemo{
    public  void display(){
        System.out.println("This is final method is overridden");
    }
    public static void main(String[]args){
        Main obj =new Main();
        obj.display();
    }
}
