import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 1;
      for(int row_num = 1 ; row_num <= n; row_num++ ){
         for(int space = 1; space <= (n - row_num) ; space++){
            System.out.print(" ");
         }
         for(int col_num = 1; col_num <= row_num ; col_num++ ){                  
          System.out.print(count+ " ");
           count++;
        }
        System.out.print("\n");
      }
	}
}