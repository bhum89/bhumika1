import java.util.Scanner;
class Alphabet{
  public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
    System.out.println("Enter an alphabet");
    Char ch=sc.next()charAt(0);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
       System.out.println("Alphabet is Vowel");
    }
    else
    {
      System.out.println("Alphabet is Consonant");
    }
  }
}
