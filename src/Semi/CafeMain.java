package Semi;

import java.util.Scanner;

public class CafeMain {
    static void main() {
        System.out.println("안녕하세요 " + Drink.CafeName + "입니다 \n\n" +
                "가게 사정으로 인해 변동사항이 있으니 메뉴 선정에 주의해주세요. \n\n" +
                "메뉴를 보여드리겠습니다.\n\n");

        Drink[] Menu = {
                new Americano("아메리카노", 3900.0, 3, 400.0),
                new Espresso("에스프레소", 4500.0, 2, "에티오피아"),
                new Mintchoco("민트초코 스무디", 5900.0, 3, 2),
                new Yogurt("요거트", 6100, "그리스", "상")};


        int i = 1;
        for (Drink item : Menu) {
            System.out.println(i + "번 메뉴\n" + item + "\n");
            i++;
            if (item instanceof Americano) {
                ((Americano) item).lowQuality(1, 500);
            } else if (item instanceof Espresso) {
                ((Espresso) item).lowQuality(1, "중국");
            } else if (item instanceof Mintchoco) {
                ((Mintchoco) item).lowQuality(1, 1);
            } else if (item instanceof Yogurt) {
                ((Yogurt) item).lowQuality("중국", "중");
            }
        }
        System.out.println("원하시는 메뉴의 숫자를 입력해주세요\n( 1 / 2 / 3 / 4 )\n");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        for (int j = 0; j < Menu.length; j++) {
            if (choice == j + 1) {
                System.out.println("\n" + (j + 1) + "번 메뉴를 고르셨습니다\n감사합니다.");

            }
        }
    }
}

