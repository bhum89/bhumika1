 public class Autoboxing1{
    public static void main(String args[]){
        int a=24;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println(a+" "+i+" "+j);
        char b='A';
        Character c=Character.valueOf(b);
        Character ch=b;
        System.out.println(b+" "+c+" "+ch);
        boolean b1=true;
        Boolean b2=Boolean.valueOf(b1);
        Boolean b3=b1;
        System.out.println(b1+" "+b2+" "+b3);
        double d=45.0D;
        Double e=Double.valueOf(d);
        Double f=d;
        System.out.println(d+" "+e+" "+f);
        float p =25.0f;
        Float g=Float.valueOf(p);
        Float h=p;
        System.out.println(p+" "+g+" "+h);
    }
}
