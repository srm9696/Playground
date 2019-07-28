import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      System.out.println(power(base, exponent));
      
	}
    public static int power(int base, int exponent){
      int result = 1;
      for(int i = 1; i <= exponent; i++){
        result *= base;
      }
      return result;
    }
}