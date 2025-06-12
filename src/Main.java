import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===계산기입니다.===");
        System.out.print("첫번째 숫자를 적어주세요 : ");
        double num1 = scanner.nextDouble();

        System.out.print("두번째 숫자를 적어주세요 : ");
        double num2 = scanner.nextDouble();

        System.out.println("원하시는 기능을 골라주세요. ");
        System.out.println("+ , - , * , / , % , ^ ");

        char choice = scanner.next().charAt(0);
        double result;

        switch (choice){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                if (num2 % 1 != 0) {
                    System.out.println("실수로 제곱할 수 없습니다.");
                    return;
                } else {
                    result = 1;
                    double square = num2;
                    while (square > 0){
                        result = result * num1;
                        square--;
                    }
                }
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }
        if(num1%1==0 && num2%1==0 && result%1==0){
            System.out.printf("%d %c %d = %d 입니다", (int)num1, choice, (int)num2, (int)result);
        } else {
            System.out.printf("%f %c %f = %f 입니다", num1, choice, num2, result);
        }
    }
}