package Semi;

public class Mintchoco extends Drink {
    private int chocoAmount; // 초코칩 양 (단위 = 스푼)
    private int mintAmount; // 민트 에센스 양 (단위 = 방울)

    public Mintchoco(String name, double price, int chocoAmount, int mintAmount) {
        this.chocoAmount = chocoAmount; // 매개변수를 MintChoco서브클래스의 맴버변수에 재할당
        this.mintAmount = mintAmount; // 매개변수를 MintChoco서브클래스의 맴버변수에 재할당
        super(name, price); // 수퍼클래스의 생성자 호출 (공통분모)
    }
    public String toString() {
        String menuFeature = super.toString() + ", 초코칩 양 : " + chocoAmount + "스푼, 민트 에센스 양 : " + mintAmount +"방울";
        return menuFeature ;
    }
    public void lowQuality(int lowChoco, int lowMint){
        System.out.println("변동 사항 : 초코칩 양(" + this.chocoAmount + " -> " + lowChoco +
                "), 민트 에센스 양(" + this.mintAmount + " -> " + lowMint + ")\n");
        this.chocoAmount = lowChoco;
        this.mintAmount = lowMint;
}
}
