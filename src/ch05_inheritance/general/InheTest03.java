package ch05_inheritance.general;

public class InheTest03 {
    static void main() {
        Americano03 americano = new Americano03("아메리카노,",4000.0,200.0);
        Espresso03 espresso = new Espresso03("에스프레소",50000.0,2);
        Latte03 latte = new Latte03("라떼",60000.0,"아몬드우유");
        americano.printInfo();
        espresso.printInfo();
        latte.printInfo();
    }

}
