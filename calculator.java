//create an interface call calculator 
interface calculator{
    public void sum();
    public void Diff();
    public void product();
    public void quotient();
}
 public class A implements calculator{
    public void sum(){
        System.out.println(3+5);
    }
    public void Diff(){
         System.out.println(5-7);
    }
    public void product(){
         System.out.println(6*7);
    }
    public void quotient(){
         System.out.println(12/3);
    }
    public static void main(String[] args){
        A a=new A();
        a.sum();
        a.Diff();
        a.product();
        a.quotient();
    }
}
