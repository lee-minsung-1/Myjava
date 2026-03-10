package ch05_inheritance;

// Animal클래스는 상속을 해주기에 super클래스가 된다
//super클래스는 sub클래스 접근이 불가하기때문에 출력은 sub클래스에 해야한다.
public class Animal {
    public String name;
    public int age;
    public String feed;

    @Override
    public String toString() {
//메소드 은닉화 : 오버라이딩시 본의 아니게 부모 메소드 접근이 막히는 현상
        String imsi = "이름:" + name + "나이:" + age + "먹이:" + feed;
         return imsi;
    }

    public void eat() {
        System.out.println(name + "이(가)" + feed + "을(를) 먹습니다");
    }

    public void bark() {
        System.out.println(name + "이(가) 쓴 스킬은 효과가 굉장했다.");
    }

    public void display() {
        System.out.println("이름" + name);
        System.out.println("나이" + age);
    }

    // eat(),bark()
}
