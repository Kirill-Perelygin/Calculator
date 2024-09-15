import java.util.Scanner;

public class Calculator {

    static double firstNumber, secondNumber;

    public static double addition(){
        return firstNumber + secondNumber;
    }
    public static double substraction(){
        return firstNumber - secondNumber;
    }
    public static double division(){
        return firstNumber / secondNumber;
    }
    public static double multiplication(){
        return firstNumber * secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Введите знак операции (-, +, /, *): ");
        char operationSign = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        secondNumber = scanner.nextDouble();

        switch (operationSign) {
            case '+':
                System.out.println("Результат сложения равен: " + Calculator.addition());
                break;
            case '-':
                System.out.println("Результат вычетания равен: " + Calculator.substraction());
                break;
            case '/':
                System.out.println("Результат деления равен: " + Calculator.division());
                break;
            case '*':
                System.out.println("Результат умножения равен: " + Calculator.multiplication());
                break;
            default:
                System.out.println("Введен неправильный знак операции!");
        }
    }
}
