import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int [arr_size];
      for(int i = 0 ; i < arr_size; i++){
         arr[i] = in.nextInt();
      }
      subsets_of_size_3(arr_size, arr);
    }
  public static void subsets_of_size_3(int arr_size, int arr[]){
      for(int i = 0 ; i < arr_size; i ++){
         for(int j = (i + 1); j < arr_size; j++){
           for(int k = j + 1 ; k < arr_size; k++){
               System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+") ");
             
           }
         }
        if (i == arr_size-1){
          break; 
        }
        System.out.println();
      }
  }
}