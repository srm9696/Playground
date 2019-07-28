import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0 ; i < arr_size ; i++){
       arr[i] = in.nextInt();
    }
    all_zeros_to_last(arr_size, arr);
    for(int i = 0 ; i < arr_size ; i++){
		System.out.print(arr[i]+" ");
    }
  	}
  public static void all_zeros_to_last(int arr_size, int arr[]){
    int count = 0;
    for(int index = 0; index < arr_size; index++){
     if(arr[index] != 0){
      int temp = arr[count];
      arr[count] = arr[index];
      arr[index] = temp;
             count++;
     }
    }
  }
}