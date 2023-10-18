class MultiCatch{
    public  static void main(String[]args){
        String s=null;
        int a[]={ 10,30,50};
        try{
            // System.out.println(s.length());
             System.out.println(a[3]);
        }
        // catch(ArrayIndexOutOfBoundsException e1){
        //     System.out.println("Exception Index out of Bounds" + e1);
        // }
         catch(NullPointerException e2){
             System.out.println("Exception Null pointer" + e2);
         }
    }
}
