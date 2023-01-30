import java.util.Scanner;

class largestArrayValue{
    static void maxValue(int arr[], int number_of_data){
        int max = 0;
        for(int i = 0; i < number_of_data; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.print("\nLargest value is " + max);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many data? ");
        int number_of_data = input.nextInt();
        int arr[] = new int[number_of_data];
        for(int i = 0; i < number_of_data; i++){
            arr[i] = input.nextInt();
        }

        maxValue(arr, number_of_data);
    }
}