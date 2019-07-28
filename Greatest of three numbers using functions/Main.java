import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(greatest_of_two_numbers(n1, n2, n3));

	}
  public static int greatest_of_two_numbers(int a, int b, int c){
    int greatest_of_two; 
    int greatest_of_three;
    if( a > b){
        greatest_of_two = a;
     }else{
        greatest_of_two = b;
     }
    if( greatest_of_two > c ){
       greatest_of_three = greatest_of_two;
    }
    else{
      greatest_of_three = c;
    }
     return greatest_of_three;
  }
}