class lamp{
    boolean On;
    void switchOn(){
        On=true;
        System.out.println(On);
    }
    void switchOff(){
        On=false;
        System.out.println(On);
    }
}
    class Main {
    public static void main (String[]args)
    {
        lamp led=new lamp();
        lamp halogen=new lamp();
        led.switchOn();
        halogen.switchOff();
    }
}
