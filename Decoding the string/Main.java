import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int key = in.nextInt();
    int len = str.length();
    char arr[] = new char[len]; 
    for(int i = 0; i < len; i++){
      char ch = str.charAt(i);
      if((ch >= 'a') && (ch <= 'z')){
        int offset = ch - 'a';
        offset = offset - key;
        if(offset < 0){
          offset = 26 + offset;
        }
        ch = (char)(offset + 'a');
      }else if((ch >= 'A') && (ch <= 'Z')){
        int offset = ch - 'A';
        offset = offset - key;
        if(offset < 0){
          offset = 26 + offset;
        }
        ch = (char)(offset + 'A');
    }
      arr[i] = ch;
    }	
    System.out.print(arr);
  }
}