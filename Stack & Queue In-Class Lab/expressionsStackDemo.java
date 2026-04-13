import java.util.Scanner;

public class expressionsStackDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        expressionsStack<Integer> numbers = new expressionsStack<>();
        expressionsStack<Character> operators = new expressionsStack<>();
    
        System.out.println("Please enter your expression I.E. (A + B) * C / D - E");
        System.out.println("+ : Addition \n - : Subtraction \n * = Multiplication \n / : Division \n ^ : Exponent");
        String expression = input.nextLine();

        char ch;
        
        for (int i = 0; i < expression.length(); i++) {
            ch = expression.charAt(i);

            if (ch == ' ') 
                continue;

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                numbers.push(num);
                i--;
            } 

            else if (ch == '(')
                operators.push(ch);

            else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    int num2 = numbers.pop();
                    int num1 = numbers.pop();
                    char op = operators.pop();
                    numbers.push(useOperator(num1, num2, op));
                }
                operators.pop(); 
            } 

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    int num2 = numbers.pop();
                    int num1 = numbers.pop();
                    char op = operators.pop();
                    numbers.push(useOperator(num1, num2, op));
                }
                operators.push(ch);
            }

            else {
                System.out.println("Invalid characters, try again");
                return;
            }
        }

        while (!operators.isEmpty()) {
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            char operator = operators.pop();
            numbers.push(useOperator(num1, num2, operator));
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

