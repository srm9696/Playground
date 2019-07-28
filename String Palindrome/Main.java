import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      StringBuilder sb = new StringBuilder(str);
      String temp_string = new String(str);
      int front = 0;
      int end = str_len-1;  
      while(front < end){
        char temp_char = str.charAt(front);
        sb.setCharAt(front, str.charAt(end));
        sb.setCharAt(end, temp_char);
        front++;
        end--;
      }
      boolean is_match = true;
      for(int i = 0; i < str_len - 1; i++){
        is_match = true; 
        if(str.charAt(i) != sb.charAt(i)){
          is_match = false;
        }
      }
      if(is_match)
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}