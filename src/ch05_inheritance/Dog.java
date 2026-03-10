package ch05_inheritance;


// Dog 클래스가 Animal 클래스를 상속받는다.
// * 클래스 이름 뒤에 extends 상속받을클래스명 *
// 상속을 받기에 sub클래스가 된다.
public class Dog extends Animal {
    boolean guide; // 안내견인가?

    @Override
    public void bark() {
        System.out.println(super.name + "이/가 멍멍 짖습니다.");;
    }

    @Override // 이 메서드는 오버라이딩되었습니다.
    //오버로딩은 하나의 클래스 안에서 이루어지는 것, 오버라이딩은 상속관계에서 이루어지는것.

    public void display() {
        super.display();
        if (guide) {
            System.out.println("안내견 여부:적합");
        } else {
            System.out.println("안내견 여부:부저어어억합");
        }
        //super는 나의 수퍼 클래스 Animal을 의미한다.
    }
}

