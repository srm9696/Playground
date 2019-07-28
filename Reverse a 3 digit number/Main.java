import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n1 = n / 100;
    int s = n % 100;
    int n2 = s / 10;
    int n3 = n % 10;
    System.out.println(n3+""+n2+""+n1);
  }
}