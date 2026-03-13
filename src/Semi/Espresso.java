package Semi;

public class Espresso extends Drink {
    private int shotCount; // 샷 개수 (단위 = 샷)
    private String coffeeOrigin; // 원두 원산지 (단위 = X)

    public Espresso(String name, double price, int shotCount, String coffeeOrigin) {
        this.shotCount = shotCount; // 매개변수를 Espresso서브클래스의 맴버변수에 재할당
        this.coffeeOrigin = coffeeOrigin; // 매개변수를 Espresso서브클래스의 맴버변수에 재할당
        super(name, price); // 수퍼클래스의 생성자 호출 (공통분모)
    }

    @Override
    public String toString() {
        String menuFeature = super.toString() + ", 샷 개수 : " + shotCount + "샷, 원두 원산지 : " + coffeeOrigin;
        return menuFeature;
    }

    public void lowQuality(int lowShot, String lowOrigin) {
        System.out.println("변동 사항 : 샷(" + this.shotCount + " -> " + lowShot +
                "), 원두 원산지(" + this.coffeeOrigin + " -> " + lowOrigin + ")\n");
        this.shotCount = lowShot;
        this.coffeeOrigin = lowOrigin;
    }
}
