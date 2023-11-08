//task 1: create a simple class having method print array and it take string array
 public class Ex{
   public<E> void printarray(E  []s){
       for (int i=0;i<s.length;i++){
           System.out.println(s[i]);
       }
   }
public static void main(String []args){
    Ex e=new Ex();
    String []s1=new String[]{"john","Ram"};
    e.<String>printarray(s1);
    Integer[]i={1,2,3};
     e.<Integer>printarray(i);
    
}
}
