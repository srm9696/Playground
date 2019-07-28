import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_num = 1; row_num <= n; row_num++){
         for(int col_num = 1; col_num <= n; col_num++){
            if((row_num == col_num) || (row_num + col_num == n + 1)){
               System.out.print("*");
            }
           else{
             System.out.print(" ");
           }
         }
        System.out.println();
      }
	}
}