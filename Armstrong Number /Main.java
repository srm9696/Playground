import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp = num;
      int original_no = num;
      int digit_count = 0;
      while(num > 0){
         num = num / 10;
         digit_count++;
      }
      int before_armstrong = 1;
      int armstrong = 0;
      int last_digit = 0;
      int count = digit_count;
      while(temp > 0){
          last_digit = temp % 10;
        while(count > 0){
          before_armstrong *= last_digit;
          count--;
        }
        armstrong += before_armstrong;
        count = digit_count; 
        before_armstrong = 1;
        
		  temp = temp / 10;
      }

      if(original_no == armstrong){
         System.out.println("Armstrong Number");
      }
      else{
         System.out.println("Not a Armstrong Number");
      }
	}
}