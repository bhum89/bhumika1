 class Automobile{
    public void start(){
        System.out.println("Engine starts running");
    }
    public void stop(){
        System.out.println("Engine starts running");
    }
    public void seatings(){ }
}
class Car extends Automobile{
    public void No_of_tyres(){
        System.out.println("there are 4 tyres");
    }
    public void fuel(){
        System.out.println("Petrol");
    }
    public void fuel(String fuel){
        System.out.println("Also runs on diesel");
    }
    public void seatings(){
        System.out.println("4 seatings");
    }
}
class Bike extends Automobile{
    public void No_of_tyres(){
        System.out.println("There are 2 tyres");
    }
    public void fuel(){
        System.out.println("Petrol");
    }
    public void seatings(){
        System.out.println("2 seatings");
    }
}
public class Main{
    public static void main(String args[]){
        Car c=new Car();
        Bike b=new Bike();
        c.No_of_tyres();
        c.fuel();
        c.fuel();
        c.seatings();
        b.No_of_tyres();
        b.fuel();
        b.seatings();
    }
}
