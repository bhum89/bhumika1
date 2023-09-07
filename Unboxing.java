 public class Unboxing1{
    public static void main(String args[]){
        
        Integer i= new Integer(8);
        int k=i.intValue();
        int j=i;
        System.out.println(i+" "+k+" "+j);
        Character b=new Character('A');
        char c=b.charValue();
        char ch=b;
        System.out.println(b+" "+c+" "+ch);
        Boolean b1=new Boolean(true);
        boolean b2=b1.booleanValue();
        boolean b3=b1;
        System.out.println(b1+" "+b2+" "+b3);
        Double d=new Double(45.0D);
        double e=d.doubleValue();
        double f=d;
        System.out.println(d+" "+e+" "+f);
        Float p =new Float(25.0f);
        float g=p.floatValue();
        float h=p;
        System.out.println(p+" "+g+" "+h);
    }
}
