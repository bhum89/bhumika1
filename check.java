import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        String a="Umbrella";
     boolean result1=false;
     for(int i=0;i<a.length();i++){
         if(a.charAt(i)=='e'){
             result1=true;
             break;
         }
     }
        System.out.println(result1);
        
    }
}
