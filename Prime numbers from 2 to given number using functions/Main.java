import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 2; i <= n ; i++){
         if(is_prime(i)){
           System.out.println(i);
         }
      }
	}
  public static boolean is_prime(int num){
     boolean is_prime = true;
     for(int i = 2; i <= num / 2; i++){
        if(num % i == 0){
           is_prime = false;
          break;
        }
     }
    return is_prime;
  }
}