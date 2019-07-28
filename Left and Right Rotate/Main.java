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
    int no_of_rotations = in.nextInt();
    odd_to_right_rotate(arr_size, arr, no_of_rotations);
    even_to_left_rotate(arr_size, arr, no_of_rotations);
    for(int i = 0 ; i < arr_size ; i++){
		System.out.print(arr[i]+" ");
    }
  	}
  public static void odd_to_right_rotate(int arr_size, int arr[], int no_of_rotations){
    int first_odd_elem_index = 0;
    int last_odd_elem_index ;
    if(arr_size % 2 == 1){
      last_odd_elem_index = arr_size - 1;
    }
    else{
      last_odd_elem_index = arr_size - 2;
    }
    for(int rotation = 1; rotation <= no_of_rotations; rotation++){
      int temp = arr[last_odd_elem_index];
      for(int index = (last_odd_elem_index - 2); index >= 0; index -=2){ 
        arr[index + 2] = arr[index];
      }
      arr[first_odd_elem_index] = temp;
    }
  }
  public static void even_to_left_rotate(int arr_size, int arr[], int no_of_rotations){
    int first_even_elem_index = 1;
    int last_even_elem_index ;
    if(arr_size % 2 == 0){
      last_even_elem_index = arr_size - 1;
    }
    else{
      last_even_elem_index = arr_size - 2;
    }
    
    for(int rotation = 1; rotation <= no_of_rotations; rotation++){
      int temp = arr[first_even_elem_index];
      for(int index = 3; index < arr_size; index +=2){ 
        arr[index - 2] = arr[index];
      }
      arr[last_even_elem_index] = temp;
    }
  }
}