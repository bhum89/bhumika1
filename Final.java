 public class Main{
    public static void main(String []args){
        final int Age =44;
       class A extends Main{ 
           
            public static void main(String []args){
                 Main obj =new Main();{
                     obj.Age=78;
                 }
                
       }
       }
        System.out.println("Age:"+Age);
    }
}
