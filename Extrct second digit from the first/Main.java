import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int secondLastDigit = n;
      int digits_count = 0;
      while(n > 0){
         n = n / 10;
        digits_count += 1;
      }   
      digits_count -=2;
      while(digits_count > 0){
        secondLastDigit /= 10;
        digits_count -= 1;
      }   
      secondLastDigit %= 10;
      System.out.println(secondLastDigit);
	}
}