import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result;
      result = gcd_of_two(n1,n2);
      System.out.print(gcd_of_two(result, n3));

	}
  public static int gcd_of_two(int a, int b){
    int min; 
    int gcd_of_two = 0;
    if( a < b){
        min = a;
     }else{
        min = b;
     }
    while( min >= 1 ){
        if(( a % min == 0) && ( b % min == 0)){
          gcd_of_two = min;
          break;
        }
      min--;
    }
     return gcd_of_two;
  }
}