import java.util.Scanner;

class backwardArray{
    static void backwards(int arr[], int number_of_data){
            System.out.println("Backwards:");
        for(int i = number_of_data; i > 0; i-- ){
            System.out.println(arr[i - 1]);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many data? ");
        int number_of_data = input.nextInt();;
        int arr[] = new int[number_of_data];
        for(int i = 0; i < number_of_data; i++){
            arr[i] = input.nextInt();
        }
        backwards(arr, number_of_data);
    }
}