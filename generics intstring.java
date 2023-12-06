class Main{
    public static void main(String []args){
        Callingclass call=new Callingclass();
        call.<String,Integer>genericsMethod("429 and 45678 are nelan's lucky number ",8);
        // call.<Integer>genericsMethod(78);
        // call.<Boolean>genericsMethod(true);
    }
}
class Callingclass{
    public<T,V>void genericsMethod(T data, V data1){
        System.out.println("Generice Method");
         System.out.println("data passed in "+data+"Generice Method "+data1);
        //   System.out.println("Generice Method "+data);
    }
}
