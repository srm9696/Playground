import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int str1_len = str1.length();
      int str2_len = str2.length();
      StringBuilder sb1 = new StringBuilder(str1);
      StringBuilder sb2 = new StringBuilder(str2);
      int count = 0;
      for(int i = 0; i < (str1_len - str2_len + 1); i++){
        boolean is_matching = true;
        for(int j = 0; j < str2_len; j++){
           if(str1.charAt(i + j) != str2.charAt(j)){
              is_matching = false;
           }
        }
        if(is_matching){
         count++;
        }
      }
        System.out.print(count);
    } 
}