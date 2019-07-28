import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
    int len = 0;
    if( n < 0)
      n = n * -1;
    while(n > 0){
      n/= 10;
      len++;
    }
    if( temp < 0)
      len = len + 1;
    char str[] = new char[len];
    if(temp < 0){
      str[0] = '-' ;
      temp = temp * -1;
    }
    len = len - 1;
    while(temp > 0){
      str[len] = (char)((temp % 10) + '0');
      temp/= 10;
      len--;
    }
    System.out.print(str);
  }
}