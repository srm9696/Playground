import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int arr[] = new int[26];
      for(int idx = 0; idx < str_len ; idx++){
         if(str.charAt(idx) >= 'a' && str.charAt(idx) <='z'){
           int offset = str.charAt(idx) - 'a';
           arr[offset]++;
         }else{
           if(str.charAt(idx) >= 'A' && str.charAt(idx) <='Z'){
           int offset = str.charAt(idx) - 'A';
           arr[offset]++;
           }
         }
      }
      for(int i = 0; i < 26; i++){
         if(arr[i] == 0){
           System.out.print((char)( i + 'a') + " ");
         }
      }
    }
}