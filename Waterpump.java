interface Machine{
    public void start();
    public void stop();
}
class Waterpump implements Machine{
    public void start(){
        System.out.println("Starts");
    }
    public void stop(){
        System.out.println("Stop");
    }
}
public class Testing{
    public static void main(String args[]){
     Machine machine =new Waterpump();
     machine.start();
     machine.stop();
     paint(new Waterpump());
    }
    public static void paint(Machine m){
        m.stop();
        System.out.println("Painting");
        m.start();
    }
}
