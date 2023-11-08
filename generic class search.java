 public class hello<E>{
     public void search(E  []s ,  E  k){
       for (int i=0;i<s.length;i++){
           if(k==s[i]){
               int flag=1;
           System.out.println("Element  found at"+i);
           break;
       }
      
   }
}



public static void main(String [] args){
    String s1[]= new String[]{"Dog","cat","John"};
    hello  m2= new hello();
    m2.search(s1,"John");
    
}

}
