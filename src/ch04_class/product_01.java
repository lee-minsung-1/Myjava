package ch04_class;

public class product_01 { // 단계01 : 클래스 정의

    //밑 변수들은 product라는 클래스의 멤버 변수이다.
    String name ; // 상품명
    int price ; // 단가
    String inputdate ;// 입고한 일자

        // 동적인 개념. 즉 동작을 하는 건 메서드로 만들어야한다.
        // 메서드를 만들땐 메서드이름, 매개변수의 갯수 및 타입 정의, 반환 타입이 있어야한다.
    //정수 1개를 입력 받아서 +5를 수행하고, 값을 반환합니다.
    // ' 매개변수'는 메서드 외부에서 넣어 주는 값입니다.
    // 반환타입 메서드이름(매개변수리스트) {...}

    int plus5(int x){
        return x + 5 ;
    }

    // 상품명 : 신라면, 단가 : 1000원, 입고 : 2026/03/01
    String showData(){
    String result = ("상품명:" + name + ", 단가 : " + price + "원, 입고 :" + inputdate);
    return  result;
    }
    //void : 타입을 반환하지않을때 쓰는 , 회색은 호출을 한 적없는 메소드라는 뜻.
    void Display () {
        System.out.println("상품명:"+name);
        System.out.println("단가:"+price);
        System.out.println("입고:"+inputdate);

    }
}
