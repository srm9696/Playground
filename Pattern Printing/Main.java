import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int coloumn = in.nextInt();
      for(int i = row; i > 0; i--){
        int j;
         for(j = 0; j < row-i; j++){
           System.out.print(row-j);
         }
	     for(int k = 0; k < coloumn-j; k++){
           System.out.print(i);
         }
  		System.out.println();	
      }
    }
}