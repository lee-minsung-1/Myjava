package ch04_class;

public class ProductMain02 {
    static void main() {
        Product02.brand= "농심";
//getter=읽기, setter=쓰기.
        Product02 shin = new Product02();
        //통장으로 비유하면 잔액조회=getter, 입출금 setter.
        Product02 blackbean = new Product02();
        shin.setName ("신라면");
        shin.setPrice(1000); // private으로 인한 간접쓰기.
        shin.inputdate = "2026/03/01"; // 기본값이므로 직접쓰기.

        System.out.println(shin.brand);

        System.out.println("상품명:"+shin.getName());
        System.out.println("단가:"+shin.getPrice());
        System.out.println("입고:"+shin.inputdate);


    }
}

