public class TestThrow{
    public static void checkNum(String s){
        if(s  == null){
            throw new ArithmeticException("\n Number is negative,cannot calculate square");
        }
        else{
            System.out.println("Square of "+s);
            
        }
    }    public static void main(String []args){
        checkNum(null);
        System.out.println("Rest of code");
    }
    
}
