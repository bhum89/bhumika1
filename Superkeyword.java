class Animal{
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
        }
        public void bark(){
            System.out.println("I can bark");
        }
    }

public class Main{
    public static void main(String args[]){
    Dog Dogobj = new Dog();
    Dogobj.eat();
    Dogobj.bark();
    }
}
