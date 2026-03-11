package ch05_inheritance.mybeverage;

import ch05_inheritance.general.Americano03;
import ch05_inheritance.general.Latte03;

public class InheTest04 {
    static void main() {
        // 승급 : 낮은 등급의 클래스가 높은 등급의 클래스타입으로 한시적 형태가 바뀌는 동작
        //전제 조건: 반드시 상속 관계이어야 합니다.
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);
        //수퍼클래스내 들어있는 메소드는 상속의 개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();

        Americano04 coffee = (Americano04) beverage01; //다운캐스팅

        coffee.sipAmericano();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);

        beverage02.showInfo();

        Espresso04 espresso = (Espresso04) beverage02;

        espresso.drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼",7000,"딸기우유");

        beverage03.showInfo();

        Latte04 coffee03 = (Latte04) beverage03;
        coffee03.enjoyLatte();
        System.out.println();

        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 2000.0, 1),
                new Latte04("바나나라떼",7000,"바나나우유")
        };
        for (int i = 0; i < beverage.length ; i++) {
            System.out.println("---------------------------------");
            beverage[i].showInfo();
            // instanceof  : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로
            //              생성이 되었는지를 판단하고자 할 때 사용합니다.
            if (beverage[i] instanceof Americano04){ // 아메리카노
                Americano04 ameri = (Americano04) beverage[i];
                ameri.sipAmericano();
            } else if(beverage[i] instanceof  Espresso04){// 에스프레소
                Espresso04 espre = (Espresso04) beverage[i];
                espre.drinkEspresso();
            } else if(beverage[i] instanceof  Latte04){ // 라떼
                Latte04 lat = (Latte04) beverage[i];
                lat.enjoyLatte();
            } else { // 차후에 혹시 모를 제품을 대비한다.

            }
           //객체를 프린트하면 암시적으로 to String() 메소드가 호출이 됩니다.
            System.out.println(beverage[i]);



        }
    }

}

