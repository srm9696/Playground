import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int choice = in.nextInt();
      int count  = 1;
      while(count <= choice){
         System.out.println("I am a Java Developer");
        count = count + 1;
      }
	}
}