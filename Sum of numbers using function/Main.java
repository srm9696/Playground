import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0;
      int i = 1;
      while(i <= n){
         sum += i ;
        i++;
      }
      System.out.print(sum);     
	}
}