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

            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {
                int num = 0;

                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }

                numbers.push(num);
                i--;
            }
        }

        while (!operators.isEmpty()) {
            int b = numbers.pop();
            int a = numbers.pop();
            char op = operators.pop();
            numbers.push(useOperator(a, b, op));
        }

        System.out.println("Result: " + numbers.pop());

    }
    public static int precedence(char operator) {
    if (operator == '^') 
            return 3;
    if (operator == '*' || operator == '/') 
        return 2;
    if (operator == '+' || operator == '-') 
        return 1;
    return 0;
}

public static int useOperator(int a, int b, char operator) {
    switch (operator) {
        case '+': 
            return a + b;
        case '-': 
            return a - b;
        case '*': 
            return a * b;
        case '/': 
            return a / b;
        case '^': 
            return (int)Math.pow(a, b);
    }
    return 0;
} 
}

