class MyData <E>{
    E s;
    public void set(E s1){
        s=s1;
    }
     public E get(){
         return(s);
     }
}
public class Main{
    public static void main(String [] args){
        // MyData<Integer> m1= new MyData<Integer>();
        // Integer i1=3;
        // m1.set(i1);
    //   System.out.println(m1.get());
      MyData<String> m2= new MyData<String>();
      String s="hello";
        m2.set(s);
      System.out.println(m2.get());
    }
}
