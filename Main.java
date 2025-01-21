import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String operation = calc(input.nextLine());
        System.out.println(operation);
    }
    public static String calc(String input) {
        String z = "";
        try {
            if (input.matches("\\d{1,2}\\s[-+/*]\\s\\d{1,2}")) {
                String str = input.replace(" ", "");
                int a, b;
                char operation;

                if (Character.isDigit(str.charAt(1))) {
                    a = Integer.parseInt(str.substring(0, 2));
                    operation = str.charAt(2);
                    b = Integer.parseInt(str.substring(3));
                } else {
                    a = Integer.parseInt(str.substring(0, 1));
                    operation = str.charAt(1);
                    b = Integer.parseInt(str.substring(2));
                }
                if (a < 1 || a > 10 || b < 1 || b > 10){
                    throw new Exception();
                }
                switch (operation) {
                    case '+':
                        z = a + b + "";
                        break;
                    case '-':
                        z = a - b + "";
                        break;
                    case '*':
                        z = a * b + "";
                        break;
                    case '/':
                        z = a / b + "";
                        break;
                    default:
                        break;
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return z;
    }
}