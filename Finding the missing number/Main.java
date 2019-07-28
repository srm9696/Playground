import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0; i < arr_size; i++){
        arr[i] = in.nextInt();
      }
      int missing_value = 0;
      for(int j = 1; j <= arr_size; j++){
        boolean is_found = false;
        for(int i = 0; i < arr_size; i++){
          if(arr[i] == j){
            is_found = true;
            break;
          }
        }
        if(is_found == false){
          System.out.print(j);
          break;
        }
      }
    }
}