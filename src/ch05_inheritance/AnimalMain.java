package ch05_inheritance;
//특화된 변수는 각 클래스에 쓰고 공통된 변수는 super클래스에 쓰는 걸 *일반화*라고 한다.
public class AnimalMain {
    static void main() {
        // 클래스이름 객체이름 = new 생성자이름();
        Dog retriver = new Dog();
        retriver.name = "김트리버";
        retriver.guide = false;
        retriver.age = 1;
        retriver.feed = "사료";

        System.out.println("객체정보");
        System.out.println(retriver.toString());

        retriver.display();
        retriver.eat();
        retriver.bark();

        System.out.println("객체 정보");
        System.out.println(retriver.toString());

        Dog maltese = new Dog();
        maltese.name = "이티즈";
        maltese.age = 152;
        maltese.guide = true;
        maltese.feed = "사료";



        maltese.display();
        maltese.eat();
        maltese.bark();

        System.out.println("객체 정보");
        System.out.println(maltese.toString());


        Cat persian = new Cat();
        persian.name = "박르시안";
        persian.indoor = true;
        persian.age = 4;
        persian.feed = "비싸고고급지고영양만점간식";


        persian.display();
        persian.eat();
        persian.bark();

        Cat siamese = new Cat();
        siamese.name = "최샴";
        siamese.indoor = false;
        siamese.age = 999999999;
        siamese.feed = "음식물";

        siamese.display();
        siamese.eat();
        siamese.bark();

    }
}
