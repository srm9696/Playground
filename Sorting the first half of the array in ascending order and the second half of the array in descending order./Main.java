import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = in.nextInt();
    }
    bubbleSortForAsc(n, arr);
    bubbleSortForDesc(n, arr);
    for(int i = 0; i < n; i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void bubbleSortForAsc(int n, int arr[]){
    int end = (n / 2) - 1;
    while(end >= 0){
       for(int i = 0; i < end; i++){
         if(arr[i] > arr[i+1]){
           int temp = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = temp;
         }
       }
      end--;
    }
  }
  public static void bubbleSortForDesc(int n, int arr[]){
    int start = n / 2;
    while(n >= start){
       for(int i = start; i < n-1; i++){
         if(arr[i] < arr[i+1]){
           int temp = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = temp;
         }
       }
      n--;
    }
  }

}