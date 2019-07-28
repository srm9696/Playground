import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++){
      list[i] = in.nextInt();
    }
    if(sum_of_three(n, list)){
    System.out.print("Perfect Batch");
    }
    else{
        System.out.print("Not a Perfect Batch");
    }
  }
   public static boolean sum_of_three(int n, int list[]){
     boolean is_perfect = true;
     int sum = list[0] + list[1] + list[2];
     int curr_sum = 0;
     for(int i = 3; i < n; i+=3){
        curr_sum = list[i] + list[i + 1] + list[i + 2] ;
          if(curr_sum != sum){
            is_perfect = false;
            break;
          }
           else{
            is_perfect = true;
           }
     }
     return is_perfect;
   }
}