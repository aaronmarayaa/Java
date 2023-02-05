import java.util.Scanner;

public class outputFormatting {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("================================");
            for(int i = 0; i < 3; i++){
                String name = input.next();
                int number = input.nextInt();
                
                System.out.printf("%-14s %03d \n", name, number);
            }
            System.out.println("================================");

    }
}