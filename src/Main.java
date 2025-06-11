import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1번부터 4번까지만 고르세요");


        int choice = scanner.nextInt();
        String item = "";

        //입력한 값에 따른 조건문
        //if문 숫자를 비교정도에만
        switch (choice) {
            case 1 :
                item = "멜론소다";
                break;

            case 2 :
                item = "제로콕";
                break;

            case 3 :
                item = "탄샨소";
                break;

            case 4 :
                item = "포카리";
                break;

            default :
                System.out.println("다시고르시오");
        }
        System.out.println(item);

    }
}