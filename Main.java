import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
        
    System.out.println("문자열 s1:");
    String s1 = stdin.next();
    System.out.println("문자열 s2:");
    String s2 = stdin.next();

    if (s1 == s2){
      System.out.println("s1==s2");
    }else{
      System.out.println("s1 != s2");
    }
    
    if (s1.equals(s2))
      System.out.println("s1==s2");
    else
      System.out.println("s1!=s2");





  }
}