import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0 ; i < arr_size; i++){
         arr[i] = in.nextInt();
      }
      int search_elem1 = in.nextInt();
      int search_elem2 = in.nextInt();
      System.out.println(find_index(arr_size, arr, search_elem1));
      System.out.println(find_index(arr_size, arr, search_elem2));
    }
  public static int find_index(int arr_size, int arr[], int search_elem){
   int index = -1;
    for(int i = 0 ; i < arr_size; i++){
         if(arr[i] == search_elem){
           index = i;
           break;
         }
    }
    return index;
  }
}