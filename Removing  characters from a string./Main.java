import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String main_str = in.nextLine();
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(main_str);
    StringBuilder result = new StringBuilder("");
    int main_len = main_str.length();
    int len = str.length();
    for(int i = 0; i < len; i++){
      for(int j = 0; j < main_len; j++){
        if(str.charAt(i) == main_str.charAt(j))
          sb.setCharAt(j,'$');
      }
    }
    for(int i = 0; i < main_len; i++){
      if(sb.charAt(i) != '$'){
        result.append(sb.charAt(i));
      }
    }
    System.out.print(result);
  }
}