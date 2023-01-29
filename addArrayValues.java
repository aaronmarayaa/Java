import java.util.Scanner;

public class addArrayValues {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("How many data? ");
      int num = input.nextInt();
      int arr[] = new int[num];
      int sum = 0;
      
      for(int i = 0; i < num; i++){
        System.out.print("Enter num: ");
        arr[i] = input.nextInt();
      }
      for(int k = 0; k < num; k++){
       sum += arr[k];
      }
    System.out.println();
    System.out.print("sum is " + sum);
    }
}