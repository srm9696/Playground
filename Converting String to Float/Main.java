import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.next();
    int len = str.length();
    double befDec = 0;
    double aftDec = 0;
    int flag = 0;
    int i  = 0;
    while(i < len){
      if(str.charAt(i) == '.')
        flag = 1;
      i++;
    }
    if(flag == 1){
      for( i = len - 1; str.charAt(i) != '.' ; i--){
        aftDec = (aftDec / 10) + (str.charAt(i) - '0');
      }
      aftDec /= 10;
      for( i = 0;  str.charAt(i) != '.'; i++){
        befDec = (befDec * 10) + (str.charAt(i) - '0');
      }
    }else{
      for( i = 0; i < len; i++){
        befDec = (befDec * 10) + (str.charAt(i) - '0');
      }
    }
    double sum = befDec + aftDec;
   	 System.out.printf("%.6f",sum);
  }
}