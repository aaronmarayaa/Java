import java.util.Scanner;

public class test {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
  
      int num = input.nextInt();
      int arr[] = new int[num];
      int sum = 0;
      
      for(int i = 0; i < num; i++){
        arr[i] = input.nextInt();
      }
      for(int k = 0; k < num; k++){
       sum += arr[k];
      }
    
    System.out.print(sum);
    }
}