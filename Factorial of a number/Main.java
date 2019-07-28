import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in  = new Scanner(System.in);
      int n = in.nextInt();
      int factorial = 1;
      while( n > 0){
         factorial *= n;
        n--;
      }
      System.out.println(factorial);
	}
}