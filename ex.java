
class Shape{
    void  area(int radius){
         System.out.println("The area is "+radius*radius);
    }
    void peri(int length,int breadth){
        System.out.println("The perimeter is"+ length*breadth) ;
    }
}
class Circle extends Shape{
    void  area(int radius){
        System.out.println("The circle area is" + 3.14*radius*radius);
    }
    void peri(int radius){
        System.out.println("The perimeter is"+ 2*3.14*radius);
    }
}
public class main{
    public static void main(String[]args){
        Shape sh=new Shape();
        Circle cr=new Circle();
        cr.area(3);
        cr.peri(2);
        sh.area(4);
        
    }
}
