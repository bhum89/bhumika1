class Parent{
    void display(){
        System.out.println("This is parent class");
    }
    void show(int num){
        System.out.println("The number in the parent class is "+num);
    }
}
class Child extends Parent{
    void display(){
        System.out.println("This class is the child class ");
    }
    void show(double num){
        System.out.println("The number in the child class is "+num);
    }
}
public class Main{
    public static void main(String [] args){
        Parent parentobj = new Parent();
        Child childobj =new Child();
        parentobj.show(7);
        childobj.show(75);
        parentobj.display();
        childobj.display();
    }
}
