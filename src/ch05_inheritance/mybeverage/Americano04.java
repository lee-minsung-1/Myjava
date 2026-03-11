package ch05_inheritance.mybeverage;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Americano04 extends Beverage04 {
    private double waterAmount; // 투입하는 물의 양;

    @Override
    public String toString() {
        String imsi = "물의 양:"+ waterAmount;
        return super.toString()+"\n"+imsi;
    }

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    //SIP : 홀짝홀찍 마시다,
    public void sipAmericano(){
        String message = super.getName() + "홀짝홀짝 마십니다";
        System.out.println(message);
    }
}