package ch05_inheritance.general;
//모든 클래스에 있어야할 필드를 적는 걸 *일반화*라고 한다.
/*
서브클래스가 수퍼클래스의 변수에 접근
1.parivate은 getter/setter로 접근
2.private대신 protected로 작성
3.생성자를 통한 대입
 */


public class Beverage03 {
    private String name ; // 이름
    private  double price ; // 가격

    public Beverage03(String name, double price){
        this.name=name;
        this.price=price;
    }

    protected void showInfo() {
        System.out.println("음료이름:"+name);
        System.out.println("음료가격:"+price+"원");
    }
}
