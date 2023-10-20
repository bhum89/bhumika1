public class TestThrowAndThrows{
     static void method()throws ArithmeticException{
        System.out.println("Inside the method()");
            throw new ArithmeticException("\n Access denied You must be at least 18 year old");
        }
         public static void main(String []args){
        try{
            method();
        }
        catch(ArithmeticException e){
            System.out.println("\ncaught in main() method");
        }
        }
}
