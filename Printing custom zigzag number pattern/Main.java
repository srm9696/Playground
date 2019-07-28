import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row_num = 1; row_num <= n; row_num++){
         for(int col_num = 1; col_num <= n; col_num++){
            if(((row_num % 2 == 1) && (col_num == n)) || 
               ((row_num % 2 == 0) && (col_num == 1))){
               System.out.print(row_num + 1);
            }
           else{
             System.out.print(row_num);
           }
         }
        System.out.println();
      }
	}
}