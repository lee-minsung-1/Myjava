package ch06_abstract_interface.cafeinterface;

public class InheTest05 {
    static void main(String[] args) {
        //부모 타입을 사용한 배열생성

        System.out.println("이랏샤아마세~~~~~"+Beverage05.STORE_NAME+"입네다");

        Beverage05[] orderList = {
                new Americano05("아메리카노", 4000.0, 200),
                new Espresso05("에스프레소", 2000.0, 1),
                new Latte05("라떼", 4300.0, "바나나우유"),
                new SpecialCoffee("나만의특제커피",9000.0,120,12,"신선한목장우유"),
                new Cappuccino05("카푸치노",5000,"우유",50)
        };

        System.out.println("주문 잔수 : " + Beverage05.getBeverageCount());

        System.out.println("메뉴를 고르세엽");
        for (Beverage05 item : orderList) {
            System.out.println("------------------------------------------");
            System.out.println(item);
            //추상메서드를 사용하면 업,다운캐스팅이 불필요하다.
            if (item instanceof Americano05) {
                ((Americano05) item).adjustWater(20);
            } else if (item instanceof Espresso05) {
                ((Espresso05) item).addShot(999999999);
            } else if (item instanceof Latte05) {
                ((Latte05)item).changeMilk("초코");
            } else if (item instanceof SpecialCoffee){
                ((SpecialCoffee)item).addShot(1);
                ((SpecialCoffee)item).adjustWater(38);
                ((SpecialCoffee)item).changeMilk("상한우유");
            } else if (item instanceof Cappuccino05) {
                ((Cappuccino05)item).changemilktype("아몬드우유");
                ((Cappuccino05)item).foam(40.1);


            }
            item.drink();
            System.out.println();
        }
    }
}
