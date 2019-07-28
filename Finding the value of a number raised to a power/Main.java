import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int val = 1;
      while(exponent > 0){
        val *= base;
        exponent--;
      }
      System.out.println(val);
    }
}