import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner scan = new Scanner(System.in);
      String str1 = scan.nextLine();
      String str2 = scan.nextLine();
      String temp = str1.concat(str1);
      boolean is_match = temp.contains(str2) ;
      if(is_match)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}