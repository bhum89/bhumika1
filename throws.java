public class TestThrow{
     static void checkAge(int age)throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("\n Access denied You must be at least 18 year old");
        }
        else{
            System.out.println("Acess granted-Yoy are old enough");
            
        }
    }    public static void main(String []args){
        checkAge(15);
        System.out.println("Rest of code");
    }
    
}
