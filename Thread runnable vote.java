class A{
static int BJP=0;
static int congress=0;
public static void Vote(String s){
if(s=="BJP"){
BJP++;
System.out.println("Won");
}
else{
congress++;
System.out.println("loss");
}
}
}
class B implements Runnable{
public void run(){
A.vote("BJP");
}
}
class C implements Runnable{
public void run(){
A.vote("congress");
}
}
public class Main{
public static void main(String [] args){
for(int i=0;i<100;i++){
Thread t=new Thread(new B());
t.start();
}
for(int i=0;i<100;i++){
Thread t1=new Thread(new C());
t1.start();
}
}
}
