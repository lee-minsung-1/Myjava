package ch04_class;

public class Product02 {
    //밑 변수들은 product라는 클래스의 멤버 변수이다.
    //변수 왼쪽에 아무것도 없으면 default 값이다.
    //static은 모든 객체들이 공유할 목적으로 사용되는 변수이다.
    // 클래스 이름으로 접근이가능하여 '클래스 변수'라고 부릅니다.
    static String brand ; // 브랜드 지역변수(스태틱 변수 = 클래스 변수)

    // 멤버 변수는 타입별로 기본 값이 있다.
    //문자열(null), 점수(0), 실수(0.0)
    private String name; // 상품명
    private int price; // 단가
    String inputdate;// 입고한 일자

    public String getName(){
     return name;
    }
    // 매개변수는 지역 변수의 부분 집합입니다.
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}


