import java.util.Scanner;
class LinearSearch{
public int LinearSearch{
    public  int LinearSearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
  {
        System.out.println("Enter a number ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
          System.out.println(a[i]);
        }
        LinearSearch ob=new LinearSearch();
       int i=ob.search(50,a);
        int key=50;
      
    
            if(i==-1){
            System.out.println("Key not found");
        }
        else
        {
            System.out.println(key+"Key  found at index "+i);
        }
        
        
        
    }
}
