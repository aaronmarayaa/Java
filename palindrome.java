import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        
        String palindrome = "";
        for(int i = str.length() - 1; i >= 0 ; i--) {
            palindrome += str.charAt(i);
        }
        
        if(palindrome.equals(str)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
