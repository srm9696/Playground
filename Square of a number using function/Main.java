import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sqr = square(n);
        System.out.print(sqr);
	} 
  public static int square(int num){
    int square = num * num;
    return square;
  }
}