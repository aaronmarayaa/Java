import java.util.Scanner;

class multiplicationTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Row count: ");
        int rows = input.nextInt();
        System.out.print("Column count: ");
        int column = input.nextInt();
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= column; j++){
                System.out.printf("%-5d", j * i);
            }
            System.out.println();
        }
    }
}