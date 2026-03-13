package Semi;

public class Drink {

    public static final String CafeName = "Bonjour";
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name; // 매개변수를 Drink수퍼클래스의 맴버변수에 재할당
        this.price = price; // 매개변수를 Drink수퍼클래스의 맴버변수에 재할당

    }
    @Override
    public String toString() {
        String menuFeature = "이름 : " + name + " , 가격 : " + price + "원";
        return menuFeature;
    }
}
