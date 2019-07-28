import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int temp[] = new int [arr_size];
      for(int i = 0; i < arr_size; i++){
        arr[i] = in.nextInt();
      }
      int left = 0;
      int right = arr_size - 1;
      while(left < right){
        temp[left] = arr[right];
        temp[right] = arr[left];
        left++;
        right--;
      }
      if(Arrays.equals(arr, temp))
        System.out.print("Yes");
      else
        System.out.print("No");
      
    }
}