package ch04_class;

public class MovieMain01 {
    static void main() {

        Movie01 hello = new Movie01();

        hello.setTitle("우리는매일매일");
    hello.setDirector("김민재감독");
    hello.setTime(100);


        //통장으로 비유하면 잔액조회=getter, 입출금 setter.
        System.out.println("영화이름:"+hello.getTitle());
        System.out.println("감독:"+hello.getDirector());
        System.out.println(hello.getTime()+"분");
    }
}
