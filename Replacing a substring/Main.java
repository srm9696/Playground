import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner scan = new Scanner(System.in);
      String main_str = scan.nextLine();
      String substring_to_be_replaced = scan.nextLine();
      String string_to_be_included= scan.nextLine();
      System.out.print(main_str.replace(substring_to_be_replaced, string_to_be_included));
    }
}