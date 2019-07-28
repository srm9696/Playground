import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int len = str.length();
    int mid_idx = len / 2 ;
    String aftMid = str.substring(mid_idx, len);
    String befMid = str.substring(0, mid_idx);
    StringBuilder sb = new StringBuilder(aftMid+befMid);
    int j = 0;
    for(int i = 0; i < len; i++){
        for(int k = 0; k < len - (i+1); k++)
          System.out.print(" ");
        for(int m = 0; m < i + 1; m++){
          System.out.print(sb.charAt(j));
          j++;
        }
      j = 0;
      System.out.println();
    }
  }
}