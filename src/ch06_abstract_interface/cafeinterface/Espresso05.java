package ch06_abstract_interface.cafeinterface;

// 1. extends 상속을 먼저 받는다.
// 2. 원래는 슈퍼클래스에서
// 3. 에스프레소에서 생성자 구비한다.
// 4. toString을 오버라이딩한다.
public class Espresso05 extends Beverage05 implements ShotAddable{
    private int shotCount;

    @Override
    public void addShot(int shot) {
        this.shotCount += shot;
        System.out.println("샷 추가 횟수:"+shot);
        System.out.println("샷 횟수:"+this.shotCount);

    }

    @Override
    public  void drink(){
        System.out.println("샷의 횟수:"+shotCount+"횟수인"+getName()+"을 진하게 한 모금 마십니다");

    }
    @Override
    public String toString() {
        return super.toString()+
                ",샷의 횟수:"+shotCount;
    }

    public Espresso05(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
}
