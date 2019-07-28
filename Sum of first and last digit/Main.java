import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int firtsDigit = n % 10;
      int LastDigit = n;
      int digits_count = 0;
      while(n > 0){
        LastDigit = n;
         n = n / 10;  
      }   
      int sum = firtsDigit + LastDigit;
      System.out.println(sum);
 }
}