public class TestThrows{
    public static int divideNum(int m,int n)throws ArithmeticException{
        int div=m/n;
        return div;
    }
        
         public static void main(String []args){
             TestThrows obj=new TestThrows();
        try{
            System.out.println(obj.divideNum(45,0));
        }
        catch(ArithmeticException e){
            System.out.println("\nNumber cannot be divided");
        }
        System.out.println("\nRest of code");
        }
}
