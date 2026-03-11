package ch05_inheritance.general;

public class Latte03 extends Beverage03 {
private String milkType ; // 우유의 양

public Latte03 (String name, double price, String Type){
    super(name, price);
    this.milkType = Type;
}
    public void printInfo(){
        super.showInfo();
        System.out.println("추가된 우유의 종류:"+milkType);


}}


