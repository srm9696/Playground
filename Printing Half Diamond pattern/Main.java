import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_num = 1 ; row_num <= n; row_num++ ){
         for(int space = 1; space <= (n - row_num) ; space++){
            System.out.print(" ");
         }
        if(row_num == 1){
                  System.out.print("*");
        }
        else{
         for(int col_num = 1; col_num <= (2 * row_num - 1) ; col_num++ ){
                    
          System.out.print("*");
        }
       }
        System.out.print("\n");
      }
	}
}