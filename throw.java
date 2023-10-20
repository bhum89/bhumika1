public class TestThrow{
    public static void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("\n Number is negative,cannot calculate square");
        }
        else{
            System.out.println("Square of "+num+"is"+(num*num));
            
        }
    }    public static void main(String []args){
        checkNum(-3);
        System.out.println("Rest of code");
    }
    
}
