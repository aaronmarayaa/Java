import java.util.Scanner;

class oddOrEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number_of_data;
        System.out.print("How many data? ");
        number_of_data = input.nextInt();
        for(int i = 1; i <= number_of_data; i++){
            if(i % 2 == 0){
                System.out.println(i + " Odd");
            }
            else{
                System.out.println(i + " Even");
            }
        }
    }
}