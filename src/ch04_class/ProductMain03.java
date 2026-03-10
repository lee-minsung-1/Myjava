package ch04_class;

public class ProductMain03 {
    static void main(String[] args) {
        // 클래스 객체이름 = new 생성자이름() ;
        Product03 shin = new Product03("신라면", 1000, "2026/03/01") ;
        //Prduct03 클래스에서 (매개변수가 일치되는) 포맷을 가진 생성자를 호출하였다
        shin.display();

        Product03 blackbean = new Product03("짜파게티", "2026/03/01") ;
        blackbean.display();

        Product03 banana = new Product03();
        banana.display();

        int size = 2;
        System.out.println("상품 "+size+"를 배열로 다뤄 봅니다");

        int[] arr = new int[3];

        // 배열정의
        Product03[] itemList = new Product03[size];

        //0번째, 1번쩨 객체 생성
        itemList[0] = new Product03("소이조이",2000,"2026/08/15");
        itemList[1] = new Product03("맥심커피","2026/07/17");

        for (int i = 0; i < itemList.length; i++) {
            System.out.println((i + 1) + "번째 상품 정보");
            itemList[i].display();

        }

        Product03[] product03Array = {
                itemList[0] = new Product03("쭈쭈바",1500,"2026/12/25"),
                itemList[0] = new Product03("사과",3000,"2026/12/25"),
                itemList[0] = new Product03("담배","2026/12/25")

        };
        for (int i = 0; i < product03Array.length ; i++) {
            System.out.println((i + 1) + "번째 상품 정보");
            product03Array[i].display();
        }
    }
}