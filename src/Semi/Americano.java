package Semi;

public class Americano extends Drink {
    private int shotCount; // 샷 개수 (단위 = 샷)
    private double waterAmount; // 물의 양 (단위 = ml)

    public Americano(String name, double price, int shotCount, double waterAmount) {
        this.shotCount = shotCount; // 매개변수를 Americano서브클래스의 맴버변수에 재할당
        this.waterAmount = waterAmount; // 매개변수를 Americano서브클래스의 맴버변수에 재할당
        super(name, price); // 수퍼클래스의 생성자 호출 (공통분모)

    }
    @Override
    public String toString() {
        String menuFeature = super.toString() + ", 샷 개수 : " + shotCount + "샷, 물의 양 : " + waterAmount + "ml";
        return menuFeature ;
    }
    public void lowQuality(int lowShot, double lowWater){
        System.out.println("변동 사항 : 샷(" + this.shotCount + " -> " + lowShot +
                "), 물의 양(" + this.waterAmount + " -> " + lowWater + ")\n");
        this.shotCount = lowShot;
        this.waterAmount = lowWater;
    }
}
