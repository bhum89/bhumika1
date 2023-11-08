//task 1: create a simple class having method print array and it take string array
 public class Ex{
   public<E> void search(E  []s ,  E  k){
       for (int i=0;i<s.length;i++){
           if(k==s[i]){
           System.out.println("Element  found at"+i);
           break;
       }
      
   }
   }
public static void main(String []args){
    Ex e=new Ex();
    String []s1=new String[]{"john","Ram"};
    e.<String>search(s1,"Ram");
    // Integer[]i={1,2,3};
    //  e.<Integer>search(i);
    
}
}
