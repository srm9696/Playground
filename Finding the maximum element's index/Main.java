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
    System.out.print(max_ele_index(n, list));
  }
   public static int max_ele_index(int n, int list[]){
     int max = 0;
     int index = 0;
     for(int i = 0; i < n; i++){
        if( list[i] > max){
           max = list[i];
           index = i;
        }
       
     }
     return index;
   }
}