import java.util.Scanner;

public class expressionsStackDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        expressionsStack<Integer> numbers = new expressionsStack<>();
        expressionsStack<Character> operators = new expressionsStack<>();
    
        System.out.println("Please enter your expression I.E. (A + B) * C / D - E");
        System.out.println("+ : Addition \n - : Subtraction \n * = Multiplication \n / : Division \n ^ : Exponent");
        String exp = input.nextLine();

        char ch;
        
        for (int i = 0; i < exp.length(); i++) {
            ch = exp.charAt(i);

            if (ch == )
        }


        
    } 
}
