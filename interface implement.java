 interface solution{
    public void Hello();
    public void Welcome();
    public void World(int a);
 }
    class A implements solution{
    public void Hello(){
        java.lang.System.out.println("Hello World");
    }
    public void Welcome(){
         java.lang.System.out.println("Welcome to Edureka");
    }
    public void World(int a){
        java.lang.System.out.println("Java World"+ a);
    }
}  
public class Main{ 
public static void main(String[]args){
    A a =new A();
    a.Hello();
    a.Welcome();
    a.World(3);
}
}
