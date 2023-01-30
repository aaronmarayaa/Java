import java.util.Scanner;

class term_grades_calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Prelim grade: ");
        float prelim = input.nextFloat();
        System.out.print("Midterm grade: ");
        float midterm = input.nextFloat();
        System.out.print("Final grade: ");
        float finals = input.nextFloat();

    float total = (prelim + midterm + finals)/3;
    
    System.out.print("\nAverage is " + total);
        
    }
}