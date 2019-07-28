import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder("");
    int len = str.length();
    int i = 0;
    while(i < len){
      if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && 
         str.charAt(i) != 'o' && str.charAt(i) != 'u'){
        sb.append(str.charAt(i));
      }
      i++;
    }
    System.out.print(sb);
  }
}