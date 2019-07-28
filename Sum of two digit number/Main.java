import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = n1 / 10;
      int n3 = n1 % 10;
      int result = n2 + n3;
      System.out.println(result);
    }
}
