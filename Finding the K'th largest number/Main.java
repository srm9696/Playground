import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = in.nextInt();
      }
       int k = in.nextInt();
      selection_sort(n, arr);
		System.out.print(arr[n - k]);      
    }   
  public static void selection_sort(int n, int arr[]){
    for(int start_idx = 0; start_idx < n - 1; start_idx++){
      int min_idx = find_min_idx(start_idx, n, arr);
      swap(start_idx, min_idx, arr);
    }
  }
    public static void swap(int start_idx, int min_idx, int arr[]){
      int temp = arr[start_idx];
      arr[start_idx] = arr[min_idx];
      arr[min_idx] = temp;
    }
      public static int find_min_idx(int start_idx, int n, int arr[]){
		int min_idx = 0;
        if(arr[start_idx] < arr[start_idx + 1]){
          min_idx = start_idx;
        }
        else{
          min_idx = start_idx + 1;
        }
        for(int idx = min_idx; idx < n; idx++){
          if(arr[idx] < arr[min_idx]){
            min_idx = idx;
          }
        }        return min_idx;
      }
}