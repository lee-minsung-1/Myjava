package ch05_inheritance;
// Cat 클래스가 Animal 클래스를 상속받는다.
// 상속을 받기에 sub클래스가 된다.
public class Cat extends Animal{
    boolean indoor ; // 집냥이인가?

    @Override
    public void bark() {
        System.out.println(super.name+"이/가 야옹 짖습니다");
    }

    @Override
    public void display() {
        super.display();
        if (indoor) {
            System.out.println("집냥이임");
        } else {
            System.out.println("길냥이임");
        }
    }


}


