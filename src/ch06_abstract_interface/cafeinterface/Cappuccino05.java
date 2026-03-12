package ch06_abstract_interface.cafeinterface;

public class Cappuccino05 extends Beverage05 implements foamAddable {

    private String milkType; // 우유종류
    private double foamAmount; // 거품량


    public Cappuccino05 (String name, int price, String milktype, int foamAmount){
        super(name,price);
        this.milkType=milktype;
        this.foamAmount=foamAmount;

    }

    @Override
    public void drink() {
        System.out.println(super.getName()+"을(를) 마십니다.");
    }

    @Override
    public void changemilktype(String milkType) {
        System.out.println("카푸치노에 들어간 우유는"+milkType+"입니다");
        this.milkType=milkType;
        System.out.println("바뀐 우유종류는:"+this.milkType);

    }

    @Override
    public void foam(double foamAmount) {
        System.out.println("들어간 거품의 양은:"+foamAmount+"입니다");
        this.foamAmount+=foamAmount;
        System.out.println("추가된 거품의 양은"+this.foamAmount);
    }
}




