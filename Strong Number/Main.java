import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in  = new Scanner(System.in);
      int n = in.nextInt();
      int factorial = 1;
      int temp = n;
      int digit;
      int sum = 0;
      for(;n > 0 ; ){
        digit = n % 10;
      while( digit > 0){
        factorial *= digit;
        digit--;     
      }   
        sum += factorial;
        factorial = 1;
        n = n / 10;
      }

      if(temp == sum)
         System.out.println("Yes");
      else
         System.out.println("No");
	}
}