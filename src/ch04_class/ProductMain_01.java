package ch04_class;

public class ProductMain_01 {
    static void main(String[] args) {

        //단계02 : 객체생성
        // 생성자 이름'은' '클래스이름'과 동일해야합니다
        // 클래스이름 객체이름 = new 생성자이름();
        Product01 shin = new Product01(); //shin,blackbean이 객체.


        //product_01 wt = new product_01();
       // wt.name;

         //heap 이라는 메모리에 shin 이 올라가는거임
        //그리고 그 shin이라는 객체가 가지고 있는 구조는

        //product black ; 을 생략할 수 있다.
        Product01 blackbean = new Product01();
//shin 객체를 "참조" 헤서 내부의 필드 값에 "접근" 한다
        shin.name ="asdada";

        //단계03 : 멤버 변수에 값을 할당.
        // .~ 을 참조연산자라고 부른다.
        shin.name = "신라면";
        shin.inputdate = "2026/03/01";
        shin.price = 1000;
        //단계04 : 멤버 변수들의 값을 출력.
        System.out.println("1번 상품 정보 출력");
        System.out.println("이름 : " + shin.name);
        System.out.println("입고 : " + shin.inputdate);
        System.out.println("단가 : " + shin.price+"원");

        blackbean.name = "짜파게티";
        blackbean.price = 1500;
        blackbean.inputdate = "2026.02.16";

        System.out.println("2번 상품의 정보를 출력합니다");
        System.out.println("이름 : " + blackbean.name);
        System.out.println("단가 : " + blackbean.price + "원");
        System.out.println("입고날짜 : " + blackbean.inputdate);

        //shin.plus5 = 입력해놓은 메서드값에 호출당함. * 변수이름은 달라도된다. 기존 메서드로 이동을하는개념.
        // return은 값을 result로 다시 돌려주는 역할.
        // shin.plus5라고 된 이유는 클래스에 shin이라는 *멤버변수*가있기때문에 참조연산자를 쓰려고 쓴 것
        int su = 3;
        int result = shin.plus5(su);
        System.out.println("결과:"+result);

        String str = shin.showData();
        System.out.println(str); // 왜 쇼데이터를 안쓰는가, 왜 리턴값으로 안돌려받았는가.

        shin.Display();


    }
}
//public class product { // 단계01 : 클래스 정의
//    String name ; // 상품명
//    int price ; // 단가
//    String inputdate ; // 입고한 일자