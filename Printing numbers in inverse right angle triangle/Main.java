import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_num = 1 ; row_num <= n; row_num++ ){
        int temp = n - (row_num - 1);
         for(int col_num = 1; col_num <= n - (row_num - 1); col_num++ ){                
          System.out.print(temp);	
           temp--;
        }
        System.out.print("\n");
      }
	}
}