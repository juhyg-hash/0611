import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.println("1. 멜론소다 (2000)");
        System.out.println("2. 제로 (2200)");
        System.out.println("3. 탄산수 (1000)");
        System.out.println("4. 포카리 (2300)");
        System.out.println();
        System.out.println("1번부터 4번까지만 고르세요");

        int price = 0;
        int choice = scanner.nextInt();
        String item = "";

        //입력한 값에 따른 조건문
        //if문 숫자를 비교정도에만
        switch (choice) {
            case 1 :
                item = "멜론소다";
                price = 2000;
                break;

            case 2 :
                item = "제로콕";
                price = 2200;
                break;

            case 3 :
                item = "탄산수";
                price = 1000;
                break;

            case 4 :
                item = "포카리";
                price = 2300;
                break;

            default :
                System.out.println("다시고르시오");
//                break;
                //return main 함수 를 아예 빠져나감
                return;

        }
        System.out.println(item + "을 선택함 금액을 넣어"); //리턴시에는 실행안됨
        int money = scanner.nextInt();

        //money 와 price 를 비교하는데는 if
        if(money < price){
            //돈더넣어야지
            System.out.println("금액부족 부족한 돈을 추가 넣어"); //while 문으로 변환하면 가능
        } else {
            int change = money - price;
//            System.out.println(item + "을 드립니다. 잔돈은 "+ change);
            System.out.printf("%s을 드립니다. 잔돈은 %d입니다.\n",item,change);
        }

        System.out.println("잘가");




    }
}