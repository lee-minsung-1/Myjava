package ch06_abstract_interface.cafeinterface;

public abstract class Beverage05 {
    private String name ;
    private double price ;
    //카페이름은 객체 생성을 하지않아도 접근이 가능하도록하는게 좋겠습니다.
    //final이 붙어있으면 편집 불가능한 상수입니다.
    public static final String STORE_NAME = "카페-벽돌집";

    private static int beverageCount = 0 ; // 주문한 커피 잔의 수

    public static  int getBeverageCount(){
        return beverageCount ;
    }

    public String getName() {
        return name;
    }

    // 모든 음료는 마십니다.
    //추상메서드는 {}=바디 바디를 가질 수 없습니다.
    //추상메소드가 있는 클래스는 반드시 추상클래스가 되어야합니다.
    public abstract void drink();


    @Override
    public String toString() {
        return "Beverage05{" +
                "name=" + name + '\n' +
                ", price=" + price +
                '}';
    }

    public Beverage05(){}

    public Beverage05(String name,double price) {
        this.name = name;
        this.price = price;

        beverageCount++; // 커피 잔 수 +1
    }
}

