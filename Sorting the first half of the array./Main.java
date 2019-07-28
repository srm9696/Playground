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
    int end = (n / 2) - 1;
    bubbleSort(end, n, arr);
  }
  public static void bubbleSort(int end, int n, int arr[]){
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
    for(int i = 0; i < n; i++){
      System.out.print(arr[i]+" ");
    }
  }

}